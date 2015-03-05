package com.nostalgiaguy.testng.listeners;

import org.testng.IExecutionListener;

public class ExecutionListener2 implements IExecutionListener {


	public void onExecutionStart() {
		System.out.println("Notify by mail that TestNG is going to start");		
	}


	public void onExecutionFinish() {
		System.out.println("Notify by mail, TestNG is finished");
	}
}