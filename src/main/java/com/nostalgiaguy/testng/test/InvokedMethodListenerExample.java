package com.nostalgiaguy.testng.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class InvokedMethodListenerExample {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@Test
	public void t1() {
		System.out.println("t1 test method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}	
}
