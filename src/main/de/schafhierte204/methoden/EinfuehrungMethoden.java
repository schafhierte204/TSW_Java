package de.schafhierte204.methoden;

import java.util.Scanner;

/**
 * Erste Aufgabe zu Methoden
 */
public class EinfuehrungMethoden {
	static void titel(int zeilen) {
		System.out.println("Herzlich Willkommen");
		for (int i = 0; i < zeilen; i++) {
			System.out.println("-------------------");
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int unterschteichungen;
		System.out.print("Wählen sie die Anzahl der Unterstreichungen für die Überschrift: ");
		unterschteichungen = in.nextInt();

		titel(unterschteichungen);
		
		in.close();
	}

}
