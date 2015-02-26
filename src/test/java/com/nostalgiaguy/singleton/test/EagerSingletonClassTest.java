package com.nostalgiaguy.singleton.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nostalgiaguy.singleton.EagerSingletonClass;

public class EagerSingletonClassTest {

	@Test
	public void testSingleton(){
		EagerSingletonClass instance1=EagerSingletonClass.getInstance();
		EagerSingletonClass instance2=EagerSingletonClass.getInstance();
		System.out.println("cheking singleton onjects equality");
		Assert.assertEquals(true, instance1==instance2);
	}
}
