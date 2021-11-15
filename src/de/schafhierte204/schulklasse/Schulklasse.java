package de.schafhierte204.schulklasse;

/**
 * Informationen ueber eine Schulklasse
 * @author Jens Hafemann
 *
 */
public class Schulklasse {

	String name;
	int schueler;
	int wochenstunden;
	String klassenlehrer;

	/**
	 * 
	 * 
	 * @param name          KlassenName
	 * @param schueler      Schueleranzahl
	 * @param wochenstunden Anzahl Wochenstunden
	 * @param klassenlehrer Name Klassenlehret
	 */
	Schulklasse(String name, int schueler, int wochenstunden, String klassenlehrer) {
		this.name = name;
		this.schueler = schueler;
		this.wochenstunden = wochenstunden;
		this.klassenlehrer = klassenlehrer;
	}

	String getInfo() {
		return "Die " + name + "besteht aus " + schueler + " SChülern,\n" + "muss wöchentlich " + wochenstunden
				+ "h leisten \n" + "und der Klassenlehrer ist " + klassenlehrer;
	}
}
