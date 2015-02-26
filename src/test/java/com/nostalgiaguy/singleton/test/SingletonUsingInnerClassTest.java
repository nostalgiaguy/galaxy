package com.nostalgiaguy.singleton.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nostalgiaguy.singleton.SingletonUsingInnerClass;

public class SingletonUsingInnerClassTest {

	@Test
	public void testSingleton(){
		SingletonUsingInnerClass instance1=SingletonUsingInnerClass.getInstance();
		SingletonUsingInnerClass instance2=SingletonUsingInnerClass.getInstance();
		System.out.println("cheking singleton objects equality");
		Assert.assertEquals(true, instance1==instance2);
	}
}
