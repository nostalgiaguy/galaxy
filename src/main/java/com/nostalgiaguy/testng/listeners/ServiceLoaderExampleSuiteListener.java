package com.nostalgiaguy.testng.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ServiceLoaderExampleSuiteListener implements ISuiteListener {

	public void onStart(ISuite suite) {
		System.out.println("on Start ServiceLoader");
	}

	public void onFinish(ISuite suite) {
		System.out.println("on finish ServiceLoader");		
	}
}
