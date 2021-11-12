package de.schafhierte204.schulklasse;

public class Schulklasse_Test {

	public static void main(String[] args) {

		Schulklasse klasse = new Schulklasse();
		klasse.name = "HIE2A";
		klasse.klassenlehrer = "Patrik Kamps";
		klasse.schueler = 16;
		klasse.wochenstunden = 36;

		System.out.println("Unsere Klasse");
		System.out.println("-------------");
		System.out.println();
		System.out.println(klasse.getInfo());

	}

}
