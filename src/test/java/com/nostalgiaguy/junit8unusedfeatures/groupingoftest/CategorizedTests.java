package com.nostalgiaguy.junit8unusedfeatures.groupingoftest;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CategorizedTests {

	@Test
	@Category(SlowTests.class)
	public void thisTestRunsSlowly() {
		System.out.println("Slow test running");
	}
	@Test
	public void thisTestRunsFast() {
		System.out.println("Fast test running");
	}

}


