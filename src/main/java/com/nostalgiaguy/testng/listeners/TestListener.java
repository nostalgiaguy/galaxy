package com.nostalgiaguy.testng.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("on test method " +  getTestMethodName(result) + " start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("on test method " + getTestMethodName(result) + " success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("on test method " + getTestMethodName(result) + " failure");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test method " + getTestMethodName(result) + " skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("test " + getTestMethodName(result) + " failed but within success");
	}

	public void onStart(ITestContext context) {
		System.out.println("on start of test " + context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("on finish of test " + context.getName());
	}
	
	private static String getTestMethodName(ITestResult result) {
		return result.getMethod().getConstructorOrMethod().getName();
	}
}
