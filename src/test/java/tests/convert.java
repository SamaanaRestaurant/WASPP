package test.java.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.pigs.PigLAtinConverter;

public class convert {

	@Test
	public void test() {
		PigLAtinConverter pig = new PigLAtinConverter();
		String s = pig.convertWord("donia");

		assertEquals("oniaday", s);
	}

}
