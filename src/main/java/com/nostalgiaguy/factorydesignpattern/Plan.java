package com.nostalgiaguy.factorydesignpattern;

abstract class Plan {
	
	protected double rate;
	
	abstract void getRate();
	
	public void calculateBill(int units){
		System.out.println(rate*units);
	}

}
