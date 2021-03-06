package com.nostalgiaguy.mocking;


import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

public class TestServiceDemo {
	

	/**
	 * Test1.
	 */
	@Test
	public void mockTest() {
		// create mock
		TestService test = mock(TestService.class);

		// define return value for method getUniqueId()
		when(test.getUniqueId()).thenReturn(43);

		// use mock in test....
		assertEquals(test.getUniqueId(), 43);
	}

	@Test
	public void spyTest(){

		TestService t1=spy(TestService.class);
		when(t1.getUniqueId()).thenReturn(43);
		assertEquals(t1.getUniqueId(), t1.getSameUniqueId());
	}

	//************************************************************************************************************************
	
	//@Test
	public void demoTest(){
		
		TestService t=new TestService();
		assertEquals(t.getUniqueId(), 43);
	}
	
	//************************************************************************************************************************

	/**
	 * Test more than one return value.
	 */
	// Demonstrates the return of multiple values
	//@Test
	public void testMoreThanOneReturnValue() {
		Iterator<String> i = mock(Iterator.class);
		when(i.next()).thenReturn("Mockito").thenReturn("is neat!!");
		String result = i.next() + " " + i.next();
		assertEquals("Mockito is neat!!", result);
	}

	/**
	 * Test return value dependent on method parameter.
	 */
	//@Test
	public void testReturnValueDependentOnMethodParameter() {
		Comparable<String> c = mock(Comparable.class);
		when(c.compareTo("Mockito")).thenReturn(1);
		when(c.compareTo("Eclipse")).thenReturn(2);
		// assert
		assertEquals(1, c.compareTo("Mockito"));
	}

	/**
	 * Test return value in dependent on method parameter.
	 */
	//@Test
	public void testReturnValueInDependentOnMethodParameter() {
		Comparable<Integer> c = mock(Comparable.class);
		when(c.compareTo(anyInt())).thenReturn(-1);
		assertEquals(-1, c.compareTo(9));
	}

	//@Test
	public void testVerify() {
		// create and configure mock
		TestService test = Mockito.mock(TestService.class);
		when(test.getUniqueId()).thenReturn(43);

		// call method testing on the mock with parameter 12
		
		test.testing(12);
		test.getUniqueId();
		test.getUniqueId();

		test.someMethod("Hello World");
		test.someMethod("called at least once");
		test.someMethod("called at least twice");
		test.someMethod("called five times");
		test.someMethod("called at most 3 times");

		// now check if method testing was called with the parameter 12
		verify(test).testing(Matchers.eq(12));

		// was the method called twice?
		verify(test, times(2)).getUniqueId();

		// other alternatives for verifiying the number of method calls for a
		// method
		verify(test, never()).someMethod("never called");
		verify(test, atLeastOnce()).someMethod("called at least once");
		
		//	Will all fail because we didn't met the conditions.
		verify(test, atLeast(2)).someMethod("called at least twice");	 
		verify(test, times(5)).someMethod("called five times");
		verify(test, atMost(3)).someMethod("called at most 3 times");
	}

}