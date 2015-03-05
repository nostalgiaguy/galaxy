package com.nostalgiaguy.testng.listeners;

import org.testng.annotations.DataProvider;

public class DataProviderFactory {
	@DataProvider
	public static Object[][] getDp1() {
		return new Object[][]{{"one"}, {"two"}, {"three"}};
	}
	
	@DataProvider
	public static Object[][] getDp2() {
		return new Object[][]{{"1"}, {"2"}, {"3"}};
	}
	
	@DataProvider(name="largeDataSet")
	public static Object[][] getLargeDataSet() {
		return new Object[][]{{"Large"}, {"Data"}, {"Set"}};
	}
	
	@DataProvider(name="constructorParams")
	public static Object[][] getConstructorParams() {
		return new Object[][]{{"a"}, {"b"}, {"c"}};
	}
}