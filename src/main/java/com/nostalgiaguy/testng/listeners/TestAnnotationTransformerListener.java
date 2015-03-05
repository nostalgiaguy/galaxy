package com.nostalgiaguy.testng.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.ITestAnnotation;

public class TestAnnotationTransformerListener implements IAnnotationTransformer {


	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {		
		if (testMethod.getName().equals("test_1")) {
			System.out.println("set data provider for " + testMethod.getName()); 
			annotation.setDataProviderClass(DataProviderFactory.class);
			annotation.setDataProvider("getDp1");
		} else if (testMethod.getName().equals("test_2")) {
			System.out.println("set data provider for " + testMethod.getName()); 
			annotation.setDataProviderClass(DataProviderFactory.class);
			annotation.setDataProvider("getDp2");
		} else if (testMethod.getName().equals("test_3")) {
			System.out.println("Disable " + testMethod.getName()); 
			annotation.setEnabled(false);
		}
	}
}