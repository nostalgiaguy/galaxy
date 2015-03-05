package com.nostalgiaguy.testng.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({com.nostalgiaguy.testng.listeners.MethodInterceptorListener.class})
public class MethodInterceptorListenerExample {
	@Test(groups="perf")
	public void t1() {
		System.out.println("test method: t1");
	}
	
	@Test
	public void t2() {
		System.out.println("test method: t2");
	}
}
