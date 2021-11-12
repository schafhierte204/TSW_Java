package de.schafhierte204.schulklasse;

public class Schulklasse {

	String name;
	int schueler;
	int wochenstunden;
	String klassenlehrer;

	String getInfo() {
		return "Die " + name + "besteht aus " + schueler + " SChülern,\nmuss wöchentlich " + wochenstunden
				+ "h leisten \nund der Klassenlehrer ist " + klassenlehrer;
	}
}
