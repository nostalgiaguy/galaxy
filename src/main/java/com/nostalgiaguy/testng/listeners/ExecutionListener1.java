package com.nostalgiaguy.testng.listeners;

import org.testng.IExecutionListener;

public class ExecutionListener1 implements IExecutionListener {
	private long startTime;


	public void onExecutionStart() {
		startTime = System.currentTimeMillis();
		System.out.println("TestNG is going to start");		
	}


	public void onExecutionFinish() {
		System.out.println("TestNG has finished, took around " + (System.currentTimeMillis() - startTime) + "ms");
	}
}