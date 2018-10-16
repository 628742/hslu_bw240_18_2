package de.hs_lu.o2s.tutorium.tut2;

public class Haus {
	
	

	public Haus(String strasse, int etagen, int einwohner, double grundstuecksFlaeche) {
		super();
		this.strasse = strasse;
		this.etagen = etagen;
		this.einwohner = einwohner;
		this.grundstuecksFlaeche = grundstuecksFlaeche;
	}

	private String strasse;
	private int etagen;
	private int einwohner;
	private double grundstuecksFlaeche;
	
	public Haus(int etagen) {
		this.etagen = etagen;
	}
	
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

	@Override
	public String toString() {
		return  this.getClass().getSimpleName() + " an der " + this.getStrasse() + " mit " + this.getEtagen() 
			+ " Etagen und " + this.getEinwohner() + " Einwohner.";
		
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getEtagen() {
		return etagen;
	}

	public void setEtagen(int etagen) {
		this.etagen = etagen;
	}

	public int getEinwohner() {
		return einwohner;
	}

	public void setEinwohner(int einwohner) {
		this.einwohner = einwohner;
	}

	public double getGrundstuecksFlaeche() {
		return grundstuecksFlaeche;
	}

	public void setGrundstuecksFlaeche(double grundstuecksFlaeche) {
		this.grundstuecksFlaeche = grundstuecksFlaeche;
	}
	
	public void druckDich() {
		System.out.println(this.toString());
	}
	
}
