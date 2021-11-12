package de.schafhierte204.schulklasse;

public class Schulklasse {

	String name;
	int schueler;
	int wochenstunden;
	String klassenlehrer;

	Schulklasse(String name,int schueler,int wochenstunden,String klassenlehrer) {
		this.name = name;
		this.schueler = schueler;
		this.wochenstunden = wochenstunden;
		this.klassenlehrer = klassenlehrer;
	}
	Schulklasse(){
		
	}

	String getInfo() {
		return "Die " + name + "besteht aus " + schueler + " SChülern,\n" + 
				"muss wöchentlich " + wochenstunden + "h leisten \n"+
				"und der Klassenlehrer ist " + klassenlehrer;
	}
}
