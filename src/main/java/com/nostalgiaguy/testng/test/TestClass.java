package com.nostalgiaguy.testng.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("********BEFORE SUITE**********");
	}
	
	@Test
	public void t() {
		System.out.println("test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("********AFTER SUITE***********");
	}
}