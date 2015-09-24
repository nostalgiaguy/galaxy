package com.nostalgiaguy.mocking2.action;

import com.nostalgiaguy.mocking2.data.Portion;
import com.nostalgiaguy.mocking2.exception.NotEnoughException;


public interface ICoffeeMachine {
	
	public boolean makeCoffee(Portion portion) throws NotEnoughException;
	public IContainer getCoffeeContainer();
	public IContainer getWaterContainer();

}
