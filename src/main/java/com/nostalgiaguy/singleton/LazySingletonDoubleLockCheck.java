package com.nostalgiaguy.singleton;

public class LazySingletonDoubleLockCheck {
	
	private static volatile LazySingletonDoubleLockCheck singletonInstance=null;
	
	private LazySingletonDoubleLockCheck(){
		
	}
	
	public static LazySingletonDoubleLockCheck getInstance(){
		if(singletonInstance==null){
			synchronized(LazySingletonDoubleLockCheck.class){
				if(singletonInstance==null){
					singletonInstance=new LazySingletonDoubleLockCheck();
				}
			}
		}
		return singletonInstance;
	}

}
