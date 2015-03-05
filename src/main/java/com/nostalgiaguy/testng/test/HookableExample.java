package com.nostalgiaguy.testng.test;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HookableExample implements IHookable {

	public void run(IHookCallBack callBack, ITestResult testResult) {
		Object[] parms = callBack.getParameters();
		if (parms[0].equals("dummy")) {
			System.out.println("Skip for parameter dummy");			
		} else {
			callBack.runTestMethod(testResult);
		}
	}
		
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@Test(dataProvider="getDp")
	public void t(String p) {
		System.out.println("test method t called with parameter " + p);
	}
	
	@DataProvider
	public Object[][] getDp() {
		return new Object[][]{{"client1"}, {"client2"}, {"dummy"}};
	}	
}
