package de.schafhierte204.methoden;

import java.util.Scanner;

/**
 * Aufgabe zu Methoden mit Rückgabewert
 */
public class BerechnungVonVolumen {
	static double kugel(double radius) {
		double volumen;
		volumen = (double) 4 / 3 * Math.PI * Math.pow(radius, 3);
		return volumen;
	}

	static double halbkugel(double radius) {
		double volumen;
		volumen =(double) 2 / 3 * Math.PI * Math.pow(radius, 3);
		return volumen;
	}

	static double zylinder(double radius, double lange) {
		double volumen;
		volumen = Math.PI * Math.pow(radius, 2) * lange;
		return volumen;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		char wahl;
		double radius, lange, ergebnis;

		System.out.println("Für welchen Körper wollen Sie das Volumen berechnen");
		System.out.println("  K/k wie Kugel");
		System.out.println("  H/h wie Halbkugel");
		System.out.println("  Z/z wie Zylinder");
		System.out.print("Ihre Wahl: ");
		wahl = in.next().charAt(0);
		System.out.println();
		switch (wahl) {
		case 'K':
		case 'k':
			System.out.print("Geben sie den Radius ein: ");
			radius = in.nextDouble();
			System.out.println();
			ergebnis = kugel(radius);
			System.out.println("Kugel:");
			System.out.println("Das Volumen beträgt: " + ergebnis);
			break;
		case 'H':
		case 'h':
			System.out.print("Geben sie den Radius ein: ");
			radius = in.nextDouble();
			System.out.println();
			ergebnis = halbkugel(radius);
			System.out.println("Halbkugel:");
			System.out.println("Das Volumen beträgt: " + ergebnis);
			break;
		case 'Z':
		case 'z':
			System.out.print("Geben sie den Radius ein: ");
			radius = in.nextDouble();
			System.out.print("Geben sie die Höhe ein: ");
			lange = in.nextDouble();
			System.out.println();
			ergebnis = zylinder(radius, lange);
			System.out.println("Zylinder");
			System.out.println("Das Volumen beträgt: " + ergebnis);
			break;
		}
		in.close();
	}
}
