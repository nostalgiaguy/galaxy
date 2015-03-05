package com.nostalgiaguy.testng.listeners;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class MethodInterceptorListener implements IMethodInterceptor {

	public List<IMethodInstance> intercept(List<IMethodInstance> methods,
			ITestContext context) {
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
		for (IMethodInstance m : methods) {
			Test test = m.getMethod().getMethod().getAnnotation(Test.class);
			Set<String> groups = new HashSet<String>();
			for (String group : test.groups()) {
				groups.add(group);
			}
			if (groups.contains("perf")) {
				result.add(m);
			} else {
				String testMethod = m.getMethod().getMethod().getName();
				System.out.println(testMethod
						+ " not a performance test so remove it");
			}
		}
		return result;
	}
}
