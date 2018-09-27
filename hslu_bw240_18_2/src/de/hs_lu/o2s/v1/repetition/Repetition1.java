package de.hs_lu.o2s.v1.repetition;

public class Repetition1 {

	public static void main(String[] args) {
		// Konsolausgabe
		System.out.println("HELLO");

		// primitive Datentypen
		String concat = "";

		System.out.println("concat=" + concat);

		int counter = 0;

		// Bedingungen
		// if ( counter==0 && (counter<=5 || counter > 6) ) {
		if (counter == 0) {
			System.out.println("Counter ist Null");
		} else if (counter < 0) {
			System.out.println("Counter ist negativ");
		} else {
			System.out.println("Counter ist positiv");
		}

		// counter = 1 --> sysout("C=1")
		// counter = 2 --> sysout("C=2")
		// counter = 3 --> sysout("C=3")
		counter = 2;
		switch (counter) {
		case 1:
			System.out.println("C=1");
			break;
		case 2:
			System.out.println("C=2");
			break;
		case 3:
			System.out.println("C=3");
			break;
		}

		// arrays
		int[] simpleNumberA = { 0, 2, 4, 6, 8, 10 };
		int[] numberA = new int[6];
		
		// array-länge
		System.out.println("Länge von simpleNumberA=" + simpleNumberA.length);

		// Schleifen
		// alle Elemente aus simpleNumberA ausgeben
		for(int i=0; i<simpleNumberA.length; i++) {
			System.out.println("simpleNumberA an Stelle i=" + i 
					+ ": " + simpleNumberA[i]);
		}
		
		// alle Inhalte aus simpleNumberA in numberA kopieren
		System.arraycopy(simpleNumberA, 2, numberA, 3, 3);
		
		System.out.println();
		
		// Gesamtsumme der Einträge aus simpleNumberA
		// Ziel: 0 + 2 + 4 + 6 + 8 + 10
		
		int gesamtSumme = 0;
		
		for(int i=0; i<simpleNumberA.length; i++) {
			//gesamtSumme = gesamtSumme + simpleNumberA[i];
			gesamtSumme += simpleNumberA[i];
		}
		
		System.out.println("Gesamtsumme ist " + gesamtSumme);
		
		// Ziel: "Array (index=wert): 1=0, 2=2, 3=4, 4=6, 5=8, 6=10, "
		String gesamtString = "Array (index=wert): \n";
		
		for(int i=0; i<simpleNumberA.length; i++) {
			gesamtString = gesamtString + i + "=" + simpleNumberA[i] + "\n";
		}
		
		System.out.println(gesamtString);
		
		// Matrix-Abbildung 2D-Arrays
		int[][] matrixAA = new int[4][2];
		
		// äußere for-Schleife für die Zeilen (4)
		for(int i=0; i<matrixAA.length; i++) {
//			System.out.println(i);
			// innere for-Schleife für die Spalten (2)
			for(int j=0;j<matrixAA[i].length;j++) {
				System.out.println("i=" + i + ", j=" + j + ", Wert=" + matrixAA[i][j]);
			}
			
		}
		
		
		
	}
}
