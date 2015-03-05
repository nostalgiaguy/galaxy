package com.nostalgiaguy.testng.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuiteListenerExample {
	
	@Parameters("ui")
	@BeforeSuite
	public void beforeSuite(String param){
		System.out.println("In Before Suite , ui value " + param);
	}
	
	@Test
	public void test_1(){
		System.out.println("In test_1");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("In after suite.");
	}

}
