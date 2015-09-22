package com.nostalgiaguy.apache.commons;

import org.apache.commons.exec.*;
import org.apache.commons.exec.Executor;

import java.io.IOException;
import java.util.concurrent.*;
public class ProcessExecutor {

	public static final Long WATCHDOG_EXIST_VALUE = -999L;


	public static Future<Long> runProcess(final CommandLine commandline,
			final ProcessExecutorHandler handler, final long watchdogTimeout)
					throws IOException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		return executor.submit(new ProcessCallable(watchdogTimeout, handler,commandline));

	}


	private static class ProcessCallable implements Callable {

		private long watchdogTimeout;
		private ProcessExecutorHandler handler;
		private CommandLine commandline;
		private ProcessCallable(long watchdogTimeout,
				ProcessExecutorHandler handler, CommandLine commandline) {
			this.watchdogTimeout = watchdogTimeout;
			this.handler = handler;
			this.commandline = commandline;
		}

		public Long call() throws Exception {
			Executor executor = new DefaultExecutor();
			executor.setProcessDestroyer(new ShutdownHookProcessDestroyer());
			ExecuteWatchdog watchDog = new ExecuteWatchdog(watchdogTimeout);
			executor.setWatchdog(watchDog);
			executor.setStreamHandler(new PumpStreamHandler(
					new MyLogOutputStream(handler, true),
					new MyLogOutputStream(handler, false)));
			Long exitValue;
			try {
				exitValue = new Long(executor.execute(commandline));
			} catch (ExecuteException e) {
				exitValue = new Long(e.getExitValue());
			}
			if (watchDog.killedProcess()) {
				exitValue = WATCHDOG_EXIST_VALUE;
			}
			return exitValue;
		}
	}
	
	private static class MyLogOutputStream extends LogOutputStream {

		private ProcessExecutorHandler handler;
		private boolean forewordToStandardOutput;
		private MyLogOutputStream(ProcessExecutorHandler handler,
				boolean forewordToStandardOutput) {
			this.handler = handler;
			this.forewordToStandardOutput = forewordToStandardOutput;
		}

		@Override
		protected void processLine(String line, int level) {
			if (forewordToStandardOutput) {
				handler.onStandardOutput(line);
			}
			else {
				handler.onStandardError(line);
			}
		}
	}
	

    public static void main(String[] args) throws IOException {

        CommandLine cl = CommandLine.parse("test.bat");
        Future<Long> exitValue = runProcess(cl, new ProcessExecutorHandler() {
            public void onStandardOutput(String msg) {
                System.out.println("output msg = " + msg);
            }
           public void onStandardError(String msg) {
                System.out.println("error msg = " + msg);
            }
        }, 1);
        try {
            Long aVoid = exitValue.get();
            System.out.println("Finished with  " + aVoid);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | ngs | File Templates.
        } catch (ExecutionException e) {
            e.printStackTrace();  //To change body of catch statement use File | ngs | File Templates.
        }
    }
}

// interface.

interface ProcessExecutorHandler {

	public void onStandardOutput(String msg);

	public void onStandardError(String msg);

}