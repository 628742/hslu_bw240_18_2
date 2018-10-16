package de.hs_lu.o2s.tutorium.tut2;

public class AppHaus {

	public static void main(String[] args) {
		Haus h1 = new Haus();
		Haus h2 = new Haus("Turmstraße");
		Haus h3 = new Haus("Wienerstraße", 4);
		Haus h4 = new Haus("Fleckstraße", 4, 10);
		
		System.out.println(h1.getEinwohner());
		System.out.println(h2.getStrasse());
		h1.setStrasse("Ernst-Boehe-Straße");
		System.out.println(h2.getStrasse());
		
		System.out.println(h1.toString());
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);

	}

}
