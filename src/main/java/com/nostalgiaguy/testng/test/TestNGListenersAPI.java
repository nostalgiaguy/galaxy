package com.nostalgiaguy.testng.test;

import org.testng.TestNG;

import com.nostalgiaguy.testng.listeners.SuiteListener;

public class TestNGListenersAPI {
	public static void main(String[] args) {
		TestNG testNG = new TestNG();
		testNG.setTestClasses(new Class[] { TestClass.class });
		testNG.addListener(new SuiteListener());
		testNG.run();
	}
}
