package de.hs_lu.o2s.tutorium.tut2;

import junit.framework.TestCase;

public class TestHaus extends TestCase {

	public void testHaus() {
		Haus h1 = new Haus(4);
		assertEquals(5, h1.getEtagen());
	}

}
