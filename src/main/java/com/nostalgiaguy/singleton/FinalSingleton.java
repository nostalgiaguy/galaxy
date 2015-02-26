package com.nostalgiaguy.singleton;

import java.io.ObjectStreamException;

public class FinalSingleton {
	
	private static final long serialVersionUID=1L;
	
	private FinalSingleton(){
		
	}
	
	private static class LazyLoadFinalSingleton{
		private static final FinalSingleton SINGLETONINSTANCE=new FinalSingleton();
	}
	
	public static FinalSingleton getInstance(){
		return LazyLoadFinalSingleton.SINGLETONINSTANCE;
	}
	
	public Object readResolve() throws ObjectStreamException{
		return getInstance();
	}

}
