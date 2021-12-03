package de.schafhierte204.tools;

public class Tools {
	private String name;
	private double a_Preis;
	private int a_Jahr;
	private double wertAktuell;
	private int n_Stunden;

	/**
	 * 
	 * @param name        Name
	 * @param a_Preis     Kaufpreis
	 * @param a_Jahr      Anschaffungsjahr
	 * @param wertAktuell aktueller Wert
	 * @param n_Stunden   Nutzungsdauer in Stunden
	 */
	public Tools(String name, double a_Preis, int a_Jahr, double wertAktuell, int n_Stunden) {
		this.name = name;
		this.a_Preis = a_Preis;
		this.a_Jahr = a_Jahr;
		this.wertAktuell = wertAktuell;
		this.n_Stunden = n_Stunden;
	}

	public String getName() {
		return name;
	}

	public double getA_Preis() {
		return a_Preis;
	}

	public int getA_Jahr() {
		return a_Jahr;
	}

	public double getWertAktuell() {
		return wertAktuell;
	}

	public int getN_Stunden() {
		return n_Stunden;
	}

	public void use(int std, int min) {
		wertAktuell -= a_Preis * (((double) std + 1d / 60 * min)/n_Stunden);
	}

	public void update(int jahr, double betrag) {
		if ((a_Jahr + 10) < jahr)
			return;
		double neuWert = wertAktuell + betrag;
		wertAktuell = neuWert < a_Preis ? neuWert : a_Preis;
	}

}
