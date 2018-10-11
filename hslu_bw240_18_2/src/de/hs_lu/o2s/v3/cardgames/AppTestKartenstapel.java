package de.hs_lu.o2s.v3.cardgames;

import de.hs_lu.o2s.v2.cardgames.Spielkarte;

public class AppTestKartenstapel {

	public static void main(String[] args) {
		
		Kartenspiel spiel = new Kartenspiel();
		
		Kartenstapel stapel1 = new Kartenstapel(spiel);
		
		System.out.println();
		
		Kartenstapel stapel2 = new Kartenstapel(new Spielkarte("kreuz", "as"));
		
		System.out.println();
		
		stapel2.push(new Spielkarte("herz","10"));
		
		System.out.println();
		
		

	}

}
