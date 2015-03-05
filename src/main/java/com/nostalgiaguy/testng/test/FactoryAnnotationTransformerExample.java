package com.nostalgiaguy.testng.test;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryAnnotationTransformerExample {
	private String name;

	@Factory
	public FactoryAnnotationTransformerExample(String name) {
		this.name = name;
		System.out.println("In constructor: " + name);
	}
	
	@Test
	public void test_1() {
		System.out.println("Method is test_1, name is " + name);
	}		
}