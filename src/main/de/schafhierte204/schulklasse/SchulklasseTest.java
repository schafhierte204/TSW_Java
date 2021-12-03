package de.schafhierte204.schulklasse;

public class SchulklasseTest {

	public static void main(String[] args) {

		Schulklasse klasse = new Schulklasse("HIE2A",16,36,"Patrik Kamps");

		System.out.println("Unsere Klasse");
		System.out.println("-------------");
		System.out.println();
		System.out.println(klasse.getInfo());

	}

}
