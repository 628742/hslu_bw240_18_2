package de.hs_lu.o2s.tutorium.tut3;

public class AppTestRestaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant r1 = new Restaurant(30);
		r1.setStrasse("Ernst-Boehe-Strasse");
		System.out.println(r1);
		Haus h1 = r1;
		System.out.println(h1);
		h1.setStrasse("Turmstrasse");
		System.out.println(r1);
		Haus h2 = new Haus();
		h2.setGrundstuecksFlaeche(250.0);
		Restaurant r2 = new Restaurant(0);
		r2.setGrundstuecksFlaeche(250.0);
		System.out.println(h2.berechneVerkaufspreis(20.0));
		System.out.println(r2.berechneVerkaufspreis(20.0));

	}

}
