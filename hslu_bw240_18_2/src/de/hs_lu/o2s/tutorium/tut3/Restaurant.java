package de.hs_lu.o2s.tutorium.tut3;

public class Restaurant extends Haus {
	
	private double sitzflaeche;
	private int maxKunden;
	
	public Restaurant(double sitzflaeche, int maxKunden) {
		super();
		this.sitzflaeche = sitzflaeche;
		this.maxKunden = maxKunden;
	}
	
	public Restaurant(int maxKunden) {
		this.maxKunden = maxKunden;
	}
	
	
	
	public double getSitzflaeche() {
		return sitzflaeche;
	}
	public void setSitzflaeche(double sitzflaeche) {
		this.sitzflaeche = sitzflaeche;
	}
	public int getMaxKunden() {
		return maxKunden;
	}
	public void setMaxKunden(int maxKunden) {
		this.maxKunden = maxKunden;
	}

	public String toString() {
		String myString;
		myString = super.toString();
		myString += "Die Sitzfläche beträgt " + this.getSitzflaeche() + " qm² und es können maximal "
					+ this.getMaxKunden() + " Kunden bewirtet werden.";
		return myString;
	}
	
	public double berechneVerkaufspreis(double quadratmeterPreis) {
//		double preis;
//		preis = this.getGrundstuecksFlaeche() * quadratmeterPreis * 3;
//		return preis;
		
		return (super.berechneVerkaufspreis(quadratmeterPreis) * 3);
	}
}
