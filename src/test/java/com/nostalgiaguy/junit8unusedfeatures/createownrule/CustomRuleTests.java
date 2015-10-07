package com.nostalgiaguy.junit8unusedfeatures.createownrule;

import org.junit.Rule;
import org.junit.Test;

public class CustomRuleTests {
	
	@Rule
	public MyCustomRule myCustomRule =new MyCustomRule("custom");
	
	@Test
	public void myAwesomeMethodInvokedSuccessfully() {
		System.out.println("Test worked OK");
	}
}
