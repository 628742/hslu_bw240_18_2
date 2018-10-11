package de.hs_lu.o2s.v3.cardgames.alternativ_aus_vl;

public class AppTestKartenstapel_alternativ {

	public static void main(String[] args) {
		Spielkarte karte = new Spielkarte("kreuz", "2");
		Kartenstapel_alternativ stapel = new Kartenstapel_alternativ(karte);
		System.out.println(stapel);
		
		stapel.push(new Spielkarte("kreuz", "3"));
		stapel.push(new Spielkarte("kreuz", "4"));
		stapel.push(new Spielkarte("kreuz", "5"));
		System.out.println(stapel);
//		Kartenstapel stapel2 = new Kartenstapel();
//		System.out.println(stapel2);
//		
//		Kartenspiel spiel = new Kartenspiel();
//		Kartenstapel stapel3 = new Kartenstapel(spiel);
//		System.out.println(stapel3);
	}

}
