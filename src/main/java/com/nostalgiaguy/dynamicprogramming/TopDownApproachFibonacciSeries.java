package com.nostalgiaguy.dynamicprogramming;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class TopDownApproachFibonacciSeries {
	
	public static long fibonacci(int n){
		if(n<3) return 1;
		
		Map<Integer,Long> computedValues=new HashMap<Integer,Long>();
		computedValues.put(1,1L);
		computedValues.put(2,1L);
		
		return fibonacci(n,computedValues);
		
	}

	private static long fibonacci(int n, Map<Integer, Long> computedValues) {
          
		if(computedValues.containsKey(n)) return computedValues.get(n);
		computedValues.put(n-1,fibonacci(n-1,computedValues));
		computedValues.put(n-2,fibonacci(n-2,computedValues));
		
		long newValue=computedValues.get(n-1)+computedValues.get(n-2);
		computedValues.put(n,newValue);
		return newValue;
		
	}

	public static void main(String args[]){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"1.  fibonacci(10)="+fibonacci(10));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"2.  fibonacci(15)="+fibonacci(15));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"3.  fibonacci(20)="+fibonacci(20));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"4.  fibonacci(25)="+fibonacci(25));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"5.  fibonacci(30)="+fibonacci(30));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"6.  fibonacci(35)="+fibonacci(35));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"7.  fibonacci(40)="+fibonacci(40));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"8.  fibonacci(45)="+fibonacci(45));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"9.  fibonacci(50)="+fibonacci(50));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"10. fibonacci(55)="+fibonacci(55));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"11. fibonacci(100)="+fibonacci(100));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"11. fibonacci(7000)="+fibonacci(7000));
	//	System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"11. fibonacci(8000)="+fibonacci(8000));
	}
}
