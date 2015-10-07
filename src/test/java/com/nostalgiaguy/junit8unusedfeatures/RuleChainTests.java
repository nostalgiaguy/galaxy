package com.nostalgiaguy.junit8unusedfeatures;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;

import com.nostalgiaguy.junit8unusedfeatures.createownrule.MyCustomRule;

public class RuleChainTests {
	
	@Rule
	public RuleChain chain = RuleChain.outerRule(new MyCustomRule("outer")).around(new MyCustomRule("inner"));
	
	@Test
	public void ruleChainWorkedOK() {
		System.out.println("Test worked OK");
	}
}
