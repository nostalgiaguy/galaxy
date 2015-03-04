package com.nostalgiaguy.dynamicprogramming;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FibonacciSeries {


	public static long fibonacci(int n){
		return (n<3)?1:(fibonacci(n-2)+fibonacci(n-1));
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
	}
}
