package com.nostalgiaguy.testng.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer2;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.ITestAnnotation;

public class DataProviderAnnotationTransformerListener implements IAnnotationTransformer2 {
	

	public void transform(IDataProviderAnnotation annotation, Method method) {
		if (annotation.getName().equals("largeDataSet")) {
			System.out.println("Large data set, run parallely");
			annotation.setParallel(true);
		}
	}	
	

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {		
	}


	public void transform(IFactoryAnnotation annotation, Method method) {
	}
	

	public void transform(IConfigurationAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	}
}