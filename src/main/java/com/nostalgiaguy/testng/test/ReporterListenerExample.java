package com.nostalgiaguy.testng.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReporterListenerExample {
	@Test(groups="perf")
	public void t1() {
		System.out.println("in t1");
	}

	@Test(groups="perf", expectedExceptions=RuntimeException.class)
	public void t2() {
		System.out.println("in t2");
	}

	@Test
	public void t3() {
		System.out.println("in t3");
	}

	@Test(groups="perf", invocationCount=5)
	public void t4() {
		System.out.println("in t4");
		i++;
		if (i==1 || i==3) {
			Assert.assertEquals(i, 10);
		}
	}
	
	private int i;
}
