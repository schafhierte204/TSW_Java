package de.schafhierte204.schulklasse;

/**
 * Informationen ueber eine Schulklasse
 * 
 * @author Jens Hafemann
 *
 */
public class Schulklasse {
	public static final int MAX_WOCHENSTUNDEN = 40;
	public static final int MAX_SCHUELER = 34;

	private String name;
	private int schueler;
	private int wochenstunden;
	private String klassenlehrer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSchueler() {
		return schueler;
	}

	public void setSchueler(int schueler) {
		if (schueler <= MAX_SCHUELER) {
			this.schueler = schueler;
		}
	}

	public int getWochenstunden() {
		return wochenstunden;
	}

	public void setWochenstunden(int wochenstunden) {
		if (wochenstunden <= MAX_WOCHENSTUNDEN) {
			this.wochenstunden = wochenstunden;
		}
	}

	public String getLehrerKuerzel() {
		int indexSpace = klassenlehrer.indexOf(' ');
		return (klassenlehrer.substring(indexSpace+1, indexSpace+3)+klassenlehrer.charAt(0)).toUpperCase();
	}

	public void setKlassenlehrer(String klassenlehrer) {
		this.klassenlehrer = klassenlehrer;
	}

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

	Schulklasse() {
	}

	String getInfo() {
		return "Die " + name + " besteht aus " + schueler + " Schülern,\n" + "muss wöchentlich " + wochenstunden
				+ "h leisten \n" + "und der Klassenlehrer ist " + klassenlehrer;
	}
}
