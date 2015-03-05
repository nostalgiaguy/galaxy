package com.nostalgiaguy.testng.test;

import org.testng.annotations.Test;

import com.nostalgiaguy.testng.listeners.DataProviderFactory;

public class DataProviderAnnotationTransformerExample {	
	
	@Test(dataProvider="largeDataSet", dataProviderClass=DataProviderFactory.class)
	public void largeDataTest(String param) {
		System.out.println("Method is t3, parameter is " + param + " threadId: "
				+ Thread.currentThread().getId());
	}		
}