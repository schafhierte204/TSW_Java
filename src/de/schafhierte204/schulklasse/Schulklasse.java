package de.schafhierte204.schulklasse;

/**
 * Informationen ueber eine Schulklasse
 * @author Jens Hafemann
 *
 */
public class Schulklasse {

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
		this.schueler = schueler;
	}

	public int getWochenstunden() {
		return wochenstunden;
	}

	public void setWochenstunden(int wochenstunden) {
		this.wochenstunden = wochenstunden;
	}

	public String getKlassenlehrer() {
		return klassenlehrer;
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
	public Schulklasse() {
	}

	String getInfo() {
		return "Die " + name + "besteht aus " + schueler + " SChülern,\n" + "muss wöchentlich " + wochenstunden
				+ "h leisten \n" + "und der Klassenlehrer ist " + klassenlehrer;
	}
}
