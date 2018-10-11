package de.hs_lu.o2s.v3.cardgames.alternativ_aus_vl;

public class Spielkarte {
	
	/**
	 * Farbe der Karte (Kreuz, Pik, Herz, Karo)
	 */
	private String farbe;
	
	/**
	 * Wert der Karte (2, 3, ..., 10, Bube, Dame, König, As, Joker)
	 */
	private String wert;  

	/**
	 * Konstruktor ohne Übergabeparameter - macht keinen Sinn
	 */
	public Spielkarte(){
		System.out.println("Achtung, diese Spielkarte " +
				"hat noch keine Farbe und noch keinen Wert");
	}
	
	/**
	 * Konstruktor mit Parametern - bitte diesen benutzen
	 * @param farbe Farbe der Karte
	 * @param wert Wert der Karte
	 */
	public Spielkarte(String farbe, String wert){
		this.farbe = farbe;
		this.wert = wert;
		//this.init(farbe, wert); // Alternative (aus Exkurs: init-3)
	}
	
	/**
	 * Konstruktor für eine Spielkarte, an die nur eine Farbe übergeben
	 * wird. Für den Wert wird dann standardmäßig der String "dummy"
	 * eingetragen.
	 * @param farbe Farbe der neuen Spielkarte
	 */
	public Spielkarte(String farbe) {
		this(farbe, "dummy"); // dies ist ein horizontaler Konstruktor-Aufruf
		//this.init(farbe, "dummy"); // dies ist die Alternative mit der Init-Methode
	}
	
	
	
	
	/**
	 * Gibt den Punktwert der Spielkarte zurück
	 * @return Punktwert der Karte
	 */
	public int getPunktwert(){
		int myVal = 0;
		String myWert = this.getWert();
		if (myWert.equals("2")) myVal = 2;
		if (myWert.equals("3")) myVal = 3;
		if (myWert.equals("4")) myVal = 4;
		if (myWert.equals("5")) myVal = 5;
		if (myWert.equals("6")) myVal = 6;
		if (myWert.equals("7")) myVal = 7;
		if (myWert.equals("8")) myVal = 8;
		if (myWert.equals("9")) myVal = 9;
		if (myWert.equals("10")) myVal = 10;
		if (myWert.equals("bube")) myVal = 2;
		if (myWert.equals("dame")) myVal = 3;
		if (myWert.equals("koenig")) myVal = 4;
		if (myWert.equals("as")) myVal = 11;
		return myVal;
	}
	
	private boolean checkFarbe(String farbe) {
		if (farbe == "pik" || farbe == "kreuz" || farbe == "herz" || farbe == "karo") {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Dies ist die alternative Programmierung für setFarbe
	 * @param farbe
	 */
	public void setFarbe(String farbe) {
		if (checkFarbe(farbe)) {
			this.farbe = farbe;
		}
		else {
			System.out.println("Ungültige Farbe");
		}	
	}
		
	/**
	 * Setter für Farbe
	 * @param farbe
	 */
//	public void setFarbe(String farbe) {
//		this.farbe = farbe;
//	}
	// dies ist auskommentiert wegen der alternativen Programmierung (s.o.)
	
	/**
	 * Setter für Wert
	 * @param wert
	 */
	public void setWert(String wert) {
		this.wert = wert;
	}
	
	/**
	 * Getter für Farbe
	 * @return Farbe der Karte
	 */
	public String getFarbe() {
		return farbe;
	}
	
	/**
	 * Getter für Wert
	 * @return Wert der Karte
	 */
	public String getWert() {
		return wert;
	}
	
	/**
	 * gibt die Karte als String auf der Konsole aus
	 */
	public void druckDich(){
		System.out.println(this.toString());
	}
	
	/**
	 * Gibt die Karte als String zurück
	 * @param kurz wenn true, dann die Kurzversion des Textes
	 * @return Karte als String
	 */
	public String toString(boolean kurz){
		if (kurz) return this.toStringKurz();
		else return this.toString();
	}
	
	/**
	 * Gibt die Karte als String zurück
	 */
	public String toString(){
		String myString = "Spielkarte mit Farbe " + farbe +
							" und Wert " + wert;
		return myString;
	}
	
	/**
	 * Gibt die Karte als kurzen String zurück
	 * @return
	 */
	public String toStringKurz(){
		return farbe + " " + wert;
	}
	
	/**
	 * Vergleicht zwei Objekte vom Typ Spielkarte anhand ihrer Farbe und Wert
	 * @param otherCard die andere Spielkarte, mit der das Objekt (this) verglichen
	 * werden soll
	 * @return true, wenn bei beiden Karten farbe und wert gleich sind; sonst false
	 */
	public boolean equals(Spielkarte otherCard){
		boolean farbenGleich = (this.getFarbe().equals(otherCard.getFarbe())); // Achtung: hier wird die String-Methode "equals" benutzt (nach getFarbe()). "==" würde nicht wie gewünscht funktionieren
		boolean werteGleich  = (this.getWert().equals(otherCard.getWert())); // Achtung: hier wird die String-Methode "equals" benutzt (nach getFarbe()). "==" würde nicht wie gewünscht funktionieren
		return farbenGleich && werteGleich;
	}

}
