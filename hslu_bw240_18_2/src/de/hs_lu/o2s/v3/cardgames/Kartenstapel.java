package de.hs_lu.o2s.v3.cardgames;

import de.hs_lu.o2s.v2.cardgames.Spielkarte; // mit diesem Befehl wird die Spielkarten-Klasse aus Vorlesung 2 importiert

public class Kartenstapel {
	
	/**
	 * Array vom Typ Spielkarte - enthält alle Karten, die auf dem Stapel liegen
	 * Index: 0: unterste Karte, ..., kartenA.length-1: oberste Karte
	 */
	Spielkarte[] kartenA;
	
	/** 
	 * Konstruktor für einen leeren Kartenstapel 
	 */
	public Kartenstapel() {
		kartenA = new Spielkarte[0];
	}
	
	/**
	 * Konstruktor für einen Kartenstapel mit genau einer Karte
	 * @param karte
	 */
	public Kartenstapel(Spielkarte karte) {	
		kartenA = new Spielkarte[1];
		kartenA[0] = karte;
	}
	
	/**
	 * Konstruktor zur Generierung eines Kartenstapels aus einem gegebenen Kartenspiel
	 * @param spiel erzeugtes Spiel der Klasse "Kartenspiel"
	 */
	public Kartenstapel(Kartenspiel spiel){
		kartenA = new Spielkarte[spiel.getKartenAnzahl()];
		
		int index = 0;  // Laufvariable zur Indexierung von kartenA (eindimensional)
		
		// Referenzierung: jeder Eintrag des Kartenstapels zeigt auf die im Kartenspiel 
		// angelegten Objekte vom Typ Spielkarte (im Kartenspiel referenziert aus dem zweidimensionalen
		// Array kartenAA)
		Spielkarte[][] kartenAA = spiel.getKartenAA();
		
		// mit kartenAA.length holen wir uns die Länge des äußeren Arrays
		for (int i = 0; i < kartenAA.length; i++){
			// mit kartenAA[0].length holen wir uns die Länge des inneren Arrays
			for (int j = 0; j < kartenAA[0].length; j++){
				kartenA[index] = kartenAA[i][j];
				index++;
			}
		}
				
	}
	
	/**
	 * Legt die übergebene Karte auf den Kartenstapel
	 * @param newCard die Karte, die oben auf den Stapel gelegt werden soll
	 */
	public void push(Spielkarte newCard){
		Spielkarte[] kartenNeu = new Spielkarte[kartenA.length + 1];  // ein um 1 größeres Array für den Stapel anlegen
		System.arraycopy(kartenA, 0, kartenNeu, 0, kartenA.length); // bisherige Karten in das neue Array kopieren (die Referenzen)
		kartenNeu[kartenA.length] = newCard;  // die neue Karte oben auf den Stapel legen
		kartenA = kartenNeu;  // den neuen Stapel der Objektvariablen zuweisen
	}
	
	
	/**
	 * Test vom Konstruktor und push
	 * @param args
	 */
	public static void main(String[] args) {
		Kartenspiel spiel1 = new Kartenspiel();  // ein neues Spiel wird angelegt
		Kartenstapel stapel1 = new Kartenstapel(spiel1);  // das Spiel wird auf den Stapel gelegt
		
		Spielkarte karte1 = spiel1.getKartenAA()[0][0]; // kreuz 2 (beliebige Karte)
		Spielkarte karte2 = spiel1.getKartenAA()[1][0]; // pik 2 (beliebige Karte)
		
		stapel1.push(karte1);  //  stapel 1 hat zunächst 52 karten - nach dem push sollten es 53 sein
		stapel1.push(karte2);  // nach dem zweiten push sollten es 54 sein (Achtung: der Index startet bei 0)

	}
}



 	



	

