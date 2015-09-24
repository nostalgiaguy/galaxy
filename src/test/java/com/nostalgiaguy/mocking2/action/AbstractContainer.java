package com.nostalgiaguy.mocking2.action;

import com.nostalgiaguy.mocking2.data.Portion;
import com.nostalgiaguy.mocking2.exception.NotEnoughException;


public abstract class AbstractContainer implements IContainer {

	private int containerTotalVolume;
	private int currentVolume;

	public AbstractContainer(int volume) {
		if (volume < 1)
			throw new IllegalArgumentException("Container's value must be greater then 0.");
		containerTotalVolume = volume;
		currentVolume = volume;
	}

	public boolean getPortion(Portion portion) throws NotEnoughException {
		int delta = currentVolume - portion.size();
		if (delta > -1) {
			currentVolume -= portion.size();
			return true;
		} else
			throw new NotEnoughException("Refill the "
					+ this.getClass().getName());
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public int getTotalVolume() {
		return containerTotalVolume;
	}

	public void refillContainer() {
		currentVolume = containerTotalVolume;
	}

}
