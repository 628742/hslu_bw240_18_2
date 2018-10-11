package de.hs_lu.o2s.v3.cardgames;

import de.hs_lu.o2s.v2.cardgames.Spielkarte; // mit diesem Befehl wird die Spielkarten-Klasse aus Vorlesung 2 importiert
import junit.framework.TestCase;

public class TestKartenspiel extends TestCase {

	Kartenspiel myKartenspiel;
	public void setUp(){
		myKartenspiel = new Kartenspiel();
	}
	
	public void testGetKartenAnzahl() {
		assertEquals(myKartenspiel.getKartenAnzahl(), 52);
	}
	public void testGetPunktwert() {
		assertEquals(myKartenspiel.getPunktwert(), 296);
	}
	
	public void testGetKartenAA() {
		assertTrue(myKartenspiel.getKartenAA() instanceof Spielkarte[][]);
	}
	
	public void testToString() {
		System.out.println(myKartenspiel.toString());
	}

}

