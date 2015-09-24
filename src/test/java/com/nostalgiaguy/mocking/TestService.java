package com.nostalgiaguy.mocking;

// TODO: Auto-generated Javadoc
/**
 * The Class TestService.
 */
public class TestService {

	/**
	 * Gets the unique id.
	 *
	 * @return the unique id
	 */
	
	public int getUniqueId() {
		return 100;
	}
	
	public int getSameUniqueId() {
		return getUniqueId();
	}
	
	public int testing(int num) {
		someMethod("");
		return num;
	}
	
	public void someMethod(String someMethod) {
		testing(1);
	}
}
