package com.nostalgiaguy.testng.test;

import java.util.Arrays;

import org.testng.TestNG;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({com.nostalgiaguy.testng.listeners.MyConfigListener.class})
public class MyConfigListenerExample {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@Test
	public void t() {
		System.out.println("test method t");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	
	public static void main(String[] args) {
		TestNG testNG = new TestNG();
		testNG.setTestSuites(Arrays.asList("/galaxy/src/main/java/com/nostalgiaguy/testng/testXmls/configurationListenerTestng.xml"));
		testNG.run();
	}
}
