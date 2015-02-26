package com.nostalgiaguy.singleton.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nostalgiaguy.singleton.LazySingletonDoubleLockCheck;

public class LazySingletonDoubleLockCheckTest {
	
	@Test
	public void testSingleton(){
		LazySingletonDoubleLockCheck instance1=LazySingletonDoubleLockCheck.getInstance();
		LazySingletonDoubleLockCheck instance2=LazySingletonDoubleLockCheck.getInstance();
		System.out.println("checking singleton objects equality");
		Assert.assertEquals(true, instance1==instance2);
	}
	

}
