package com.nostalgiaguy.junit8unusedfeatures;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TestNameTests {

	@Rule
	public TestName name1 = new TestName();
	@Rule
	public TestName name2 = new TestName();
	
	@Test
	public void methodNameShouldBePrinted_1() {
		System.out.println("Test method name: " +name1.getMethodName());
	}
	
	@Test
	public void methodNameShouldBePrinted_2() {
		System.out.println("Test method name: " +name2.getMethodName());
	}

}
