package com.nostalgiaguy.testng.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotationTransformerExample {
	
	@BeforeSuite(description="Before Suite Annotation")
	public void beforeSuite(){
		System.out.println("In Before Suite");
	}
	
	@BeforeTest(description="Before Test Annotation")
	public void beforeTest(){
		System.out.println("In Before Test");
	}
	
	@BeforeMethod(description="Before Method Annotation")
	public void beforeMethod(){
		System.out.println("In Before Method");
	}
	
	@Test(description="First Test Annotation")
	public void firstTest(){
		System.out.println("In First Test");
	}
	
	@Test(description="Second Test Annotation")
	public void secondTest(){
		System.out.println("In Second Test");
	}
	
	@AfterMethod(description="After Method Annotation")
	public void afterMethod(){
		System.out.println("In After Method");
	}
	
	@AfterTest(description="After Test Annotation")
	public void afterTest(){
		System.out.println("In After Test");
	}
	
	@AfterSuite(description="After Suite Annotation")
	public void afterSuite(){
		System.out.println("In After Suite");
	}

}
