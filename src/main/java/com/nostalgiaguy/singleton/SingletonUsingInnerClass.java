package com.nostalgiaguy.singleton;

public class SingletonUsingInnerClass {
	
	private SingletonUsingInnerClass(){
		
	}
	
	private static class LazySingleton{
		private static final SingletonUsingInnerClass SINGLETONINSTANCE=new SingletonUsingInnerClass();	
	}
	
	public static SingletonUsingInnerClass getInstance(){
		return LazySingleton.SINGLETONINSTANCE;
	}

}
