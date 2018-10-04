package de.hs_lu.o2s.v2.cardgames;

public class AppTestSpielkarte {

	public static void main(String[] args) {
		Spielkarte myCard1 = new Spielkarte();
		Spielkarte myCard2 = new Spielkarte();
		myCard1.setFarbe("kreuz");
		myCard1.setWert("as");
		myCard2.setFarbe("karo");
		myCard2.setWert("10");
		System.out.println(myCard1.toString());
		System.out.println(myCard2.toString());

//		myCard1.druckDich();
//		myCard2.druckDich();
		
//		System.out.println(myCard1.toStringKurz());
//		System.out.println(myCard2);

//		System.out.println("myCard1 hat die Farbe " + myCard1.farbe +
//							" und den Wert " + myCard1.wert);
//		System.out.println("myCard2 hat die Farbe " + myCard2.farbe +
//							" und den Wert " + myCard2.wert);
		
		
		// --- Objektvergleich ---
		String myString1 = "Hans";
		String myString2 = "Hans";
		
		/* das Folgende sollte eigentlich false liefern, weil Strings auch Objekte sind. 
		 * Allerdings optimiert der Compiler, so dass für Strings hier auch 
		 * true geliefert wird. Bei anderen Objekten ist das nicht der Fall!
		 */
		System.out.print("myString1 == myString2 (das ist die Ausnahme durch Compileroptimierung!)? ");
		System.out.println(myString1 == myString2);
		
		/* String ist also ein Sonderfall! Man kann das z.B. 
		 * durch Verwendung von substring zeigen: 
		 */
		String myString3 = "Hans";
		String myString4 = "Hansi";
		
		// das Folgende liefert false (korrekt, Hans <> Hansi)
		System.out.print("myString3 == myString4? ");
		System.out.println(myString3 == myString4);
		
		// das hier liefert auch false, obwohl beide Zeichenketten gleich sind
		System.out.print("myString3 == myString4.substring(0,  4)? ");
		System.out.println(myString3 == myString4.substring(0,  4));
		/* hier kann der Compiler für myString4 nicht optimieren, da erst 
		 * zur Laufzeit die Methode substring aufgerufen wird.
		 */  
		
		// Nun schauen wir es uns für die Spielkarten an:
		Spielkarte myCard3 = new Spielkarte("kreuz", "as");
		Spielkarte myCard4 = new Spielkarte("kreuz", "as");
		System.out.print("myCard3 == myCard4? ");
		System.out.println(myCard3 == myCard4); // liefert false, obwohl das doch die gleichen Karten hinsichtlich farbe und wert sind
		
		// wir haben die Methode equals in Spielkarte implementiert:
		System.out.print("myCard3.equals(myCard4)? ");
		System.out.println(myCard3.equals(myCard4));
		
	}

}
