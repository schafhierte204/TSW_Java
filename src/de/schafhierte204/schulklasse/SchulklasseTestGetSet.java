package de.schafhierte204.schulklasse;

import java.util.Scanner;

public class SchulklasseTestGetSet {

	public static void main(String[] args) {
		Schulklasse klasse = new Schulklasse();
		Scanner in = new Scanner(System.in);
		char weiter;
		System.out.println("******************************************************");
		System.out.println("*  Klassenerfassung - bitte folgende Daten eingeben  *");
		System.out.println("******************************************************");
		do {
			System.out.println();
			System.out.print("Name der Klasse: ");
			klasse.setName(in.nextLine());
			System.out.print("Name des Klassenlehrers: ");
			klasse.setKlassenlehrer(in.nextLine());
			System.out.print("Anzahl der Schüler - maximal " + Schulklasse.MAX_SCHUELER + " : ");
			klasse.setSchueler(in.nextInt());
			System.out.print("Anzahl der Wochenstunden - maximal " + Schulklasse.MAX_WOCHENSTUNDEN + " : ");
			klasse.setWochenstunden(in.nextInt());
			System.out.println();
			System.out.println("Hier Ihre Daten zum Abgleich:");
			System.out.println("Klasse: " + klasse.getName());
			System.out.println("Küerzel des Klassenlehrers: " + klasse.getLehrerKuerzel());
			System.out.println(
					"mit " + klasse.getSchueler() + " Schülern und " + klasse.getWochenstunden() + " Wochenstunden");
			System.out.println();
			System.out.print("Änderungen notwendig (J/N) ?");
			weiter = in.next().charAt(0);
			in.nextLine();

		} while (weiter == 'j');
		in.close();
	}

}
