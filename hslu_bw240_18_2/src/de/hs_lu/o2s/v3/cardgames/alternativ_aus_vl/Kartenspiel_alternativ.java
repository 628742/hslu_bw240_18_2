package de.hs_lu.o2s.v3.cardgames.alternativ_aus_vl;

public class Kartenspiel_alternativ {

	private String[] farben = {"kreuz", "pik", "herz", "karo"};
	private String[] werte = {"2","3","4","5","6","7","8","9","10","bube","dame","koenig","as"};
	
	private Spielkarte[][] kartenAA;
			
	public Kartenspiel_alternativ() {
		
		// 2D-Array anlegen ("52 Platzhalter für Spielkarten") - zunächst keine Karten referenziert
		kartenAA = new Spielkarte[farben.length][werte.length];
		
		// pro Farbe-Wert-Kombination eine Spielkarte anlegen
		for(int i=0; i<farben.length; i++) {
			for(int j=0; j<werte.length; j++) {
				Spielkarte neueKarte = new Spielkarte(farben[i], werte[j]);
				kartenAA[i][j] = neueKarte;
				//System.out.println(neueKarte.toString());
			}
		}
	}
	
	/**
	 * Gibt die Anzahl der Spielkarten zurück
	 * @return # Spielkarten
	 */
	public int getKartenAnzahl() {
		return farben.length * werte.length;
	}
	
	public int getAnzahlFarben() {
		return farben.length;
	}
	
	public int getAnzahlWerte() {
		return werte.length;
	}

	public Spielkarte[][] getKartenAA() {
		return kartenAA;
	}

	public Spielkarte getSpielkarte(int f, int w) {
		return this.kartenAA[f][w];
	}
	
	/**
	 * Berechnet den kumulierten Punktwert aller Karten 
	 * @return Gesamtpunktwert
	 */
	public int getGesamtPunktWert() {
		int gesamtPunktwert = 0;
		
		// pro Farbe-Wert-Kombination die entsprechende Spielkarte nach
		// dem Punktwert fragen
		for(int i=0; i<farben.length; i++) {
			for(int j=0; j<werte.length; j++) {
				gesamtPunktwert += kartenAA[i][j].getPunktwert();
				
			}
		}
		return gesamtPunktwert;
	}
	
	public String toString() {
		String myString = "";
		myString += "Kartenspiel mit " + this.getKartenAnzahl() + " und Gesamtpunktwert ";
		myString += this.getGesamtPunktWert() + " und folgenden Karten:\n";
		// pro Farbe-Wert-Kombination die entsprechende Spielkarte nach
		// ihrem String fragen
		for(int i=0; i<farben.length; i++) {
			for(int j=0; j<werte.length; j++) {
				myString += kartenAA[i][j].toString() + "\n";
				
			}
		}
		
		return myString;
		
	}
	
	
	
	
}
