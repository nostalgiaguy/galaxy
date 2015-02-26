package com.nostalgiaguy.singleton;

public class LazySingleton {
	
	private static volatile LazySingleton singletonInstance=null;
	
	private LazySingleton(){
		
	}
	
	public static LazySingleton getInstance(){
		if(singletonInstance==null){
			synchronized(LazySingleton.class){
				singletonInstance=new LazySingleton();
			}
		}
		return singletonInstance;
	}

}
