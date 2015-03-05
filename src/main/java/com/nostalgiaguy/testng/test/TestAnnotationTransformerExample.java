package com.nostalgiaguy.testng.test;

import org.testng.annotations.Test;

public class TestAnnotationTransformerExample {
	
	@Test
	public void test_1(String param) {
		System.out.println("Method is test_1, parameter is " + param);
	}
	
	@Test
	public void test_2(String param) {
		System.out.println("Method is test_2, parameter is " + param);
	}
	
	@Test
	public void test_3() {
		System.out.println("Method is test_3");
	}		
}