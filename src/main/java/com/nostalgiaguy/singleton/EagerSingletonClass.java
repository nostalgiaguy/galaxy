package com.nostalgiaguy.singleton;

public class EagerSingletonClass {
	
	private static volatile EagerSingletonClass singletonInstance=new EagerSingletonClass();
	
	private EagerSingletonClass(){
		
	}
	
	public static EagerSingletonClass getInstance(){
		return singletonInstance;
		
	}

}
