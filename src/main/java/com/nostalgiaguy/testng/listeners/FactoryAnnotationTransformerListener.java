package com.nostalgiaguy.testng.listeners;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer2;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.ITestAnnotation;

public class FactoryAnnotationTransformerListener implements IAnnotationTransformer2 {


	public void transform(IFactoryAnnotation annotation, Method method) {
		annotation.setDataProvider("constructorParams");
		annotation.setDataProviderClass(DataProviderFactory.class);
	}
	

	public void transform(IConfigurationAnnotation annotation, Class testClass,	Constructor testConstructor, Method testMethod) {
	}


	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {		
	}


	public void transform(IDataProviderAnnotation annotation, Method method) {
	}
}