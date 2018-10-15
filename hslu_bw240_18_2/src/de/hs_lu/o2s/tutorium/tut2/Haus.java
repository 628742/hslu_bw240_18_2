package de.hs_lu.o2s.tutorium.tut2;

public class Haus {
	
	

	private String strasse;
	private int etagen;
	private int einwohner;
	private double grundstuecksFlaeche;
	
	public Haus() {
		
	}
	
	public Haus(String strasse) {
		this.strasse = strasse;
	}
	
	public Haus(String strasse, int etagen) {
		this(strasse);
		this.etagen = etagen;
	}
	
	public Haus(String strasse, int etagen, int einwohner) {
		this(strasse, etagen);
		this.einwohner = einwohner;
	}
	
}
