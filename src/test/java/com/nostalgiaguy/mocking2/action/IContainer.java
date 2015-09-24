package com.nostalgiaguy.mocking2.action;

import com.nostalgiaguy.mocking2.data.Portion;
import com.nostalgiaguy.mocking2.exception.NotEnoughException;


public interface IContainer {
	
	public boolean getPortion(Portion portion) throws NotEnoughException;
	public int getCurrentVolume();
	public int getTotalVolume();
	public void refillContainer();

}
