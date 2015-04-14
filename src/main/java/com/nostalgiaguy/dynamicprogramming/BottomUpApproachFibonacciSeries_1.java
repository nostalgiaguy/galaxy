package com.nostalgiaguy.dynamicprogramming;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BottomUpApproachFibonacciSeries_1 {
	
	public static long fibonacci(int n){
		long n1=1;
		long n2=1;
		long current=2;
		
		for(int i=3;i<=n;i++){
			current=n1 + n2;
			//System.out.println(current);
			n2=n1;
			n1=current;
		}
		return current;
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
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"11. fibonacci(60)="+fibonacci(60));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"12. fibonacci(10000)="+fibonacci(10000));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"13. fibonacci(30000)="+fibonacci(30000));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"14. fibonacci(50000)="+fibonacci(50000));
		System.out.println(sdf.format(Calendar.getInstance().getTime())+" "+"15. fibonacci(500000)="+fibonacci(500000));
	}

}
