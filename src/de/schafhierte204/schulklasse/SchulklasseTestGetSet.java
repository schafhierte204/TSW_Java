package de.schafhierte204.schulklasse;

public class SchulklasseTestGetSet {

	public static void main(String[] args) {
		Schulklasse klasse = new Schulklasse();
		klasse.setName("HIE2A");
		klasse.setSchueler(16);
		klasse.setWochenstunden(35);
		klasse.setKlassenlehrer("Patrik Kamps");

		System.out.println("Unsere Klasse");
		System.out.println("-------------");
		System.out.println();
		System.out.println("Klassenlehrer: " + klasse.getKlassenlehrer() + " Anzahl Schueler: " + klasse.getSchueler()
				+ "\nAnzahl Wochenstunden: " + klasse.getWochenstunden() + " Name: " + klasse.getName());
	}

}
