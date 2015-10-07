package com.nostalgiaguy.junit8unusedfeatures;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LongRunningTests {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(5);

	@Test
	public void whatWeDoInATestMethodEchoesInEternity() {
		while(true);
	}

}
