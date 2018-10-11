package de.hs_lu.o2s.v3.cardgames.alternativ_aus_vl;

public class Kartenstapel_alternativ {
	
	private Spielkarte[] kartenA;
	
	public Kartenstapel_alternativ(Spielkarte karte) {
		kartenA = new Spielkarte[1];
		kartenA[0] = karte;
	}
	
	/**
	 * Einen leeren Kartenstapel anlegen
	 */
	public Kartenstapel_alternativ() {
		kartenA = new Spielkarte[0]; // Array initialisieren (ohne auf Karten zu referenzieren)
	}
	
	/**
	 * Einen Kartenstapel anlegen, auf dem alle Karten eines
	 * übergebenen Kartenspiels liegen
	 */
	public Kartenstapel_alternativ(Kartenspiel_alternativ spiel) {
		kartenA = new Spielkarte[spiel.getKartenAnzahl()];
		int counter = 0;
		
		for (int f=0; f<spiel.getAnzahlFarben(); f++) {
			for (int w=0; w<spiel.getAnzahlWerte(); w++) {
				kartenA[counter] = spiel.getSpielkarte(f, w); 
				counter++;
			}
		}
	}
	
	public int getAnzahlKarten() {
		return kartenA.length;
	}
	
	public void push(Spielkarte newCard) {
		Spielkarte[] kartenNeuA = new Spielkarte[kartenA.length+1];
		
		// alle alten Karten auch aus kartenNeuA referenzieren
		System.arraycopy(kartenA, 0, kartenNeuA, 0, kartenA.length);
		
		// neue Karten hinten an das neue Array anfügen
		kartenNeuA[kartenA.length] = newCard;
		this.kartenA = kartenNeuA;
	}
	
	public String toString() {
		String myString = "Kartenstapel mit " + this.getAnzahlKarten() + " Karten \n";
		for (int i=0; i<kartenA.length;i++) {
			myString += kartenA[i].toString() + "\n";
		}
		
		return myString;
	}

}
