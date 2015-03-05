package com.nostalgiaguy.testng.listeners;

import org.testng.IConfigurationListener2;
import org.testng.ITestResult;

public class MyConfigListener implements IConfigurationListener2 {

	public void onConfigurationSuccess(ITestResult tr) {
		System.out.println("on configuration success");		
	}

	public void onConfigurationFailure(ITestResult tr) {
		System.out.println("on configuration failure");	
	}

	public void onConfigurationSkip(ITestResult tr) {
		System.out.println("on configuration skip");			
	}

	public void beforeConfiguration(ITestResult tr) {
		System.out.println("called before the configuration method is invoked");
	}
}
