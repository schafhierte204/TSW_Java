package de.schafhierte204.tools;

public class TestTools {
	private static void printAtribute(Tools tool) {
		System.out.println(tool.getName() + " Preis: " + tool.getA_Preis() + " Wert: " + tool.getWertAktuell()
				+ " AnschaffungsJahr: " + tool.getA_Jahr() + " Stundensoll: " + tool.getN_Stunden());
		
	}

	public static void main(String[] args) {
		Tools tool1 = new Tools("Hammer", 20, 2020, 20, 500);
		Tools tool2 = new Tools("Axt", 50, 2020, 40, 500);
		Tools tool3 = new Tools("Beil", 10, 2020, 10, 50);

		printAtribute(tool1);
		printAtribute(tool2);
		printAtribute(tool3);
		System.out.println();

		tool1.use(2, 4);
		tool2.use(10, 0);
		tool3.use(50, 0);

		printAtribute(tool1);
		printAtribute(tool2);
		printAtribute(tool3);
		System.out.println();

		tool1.update(2031, 5);
		tool2.update(2030, 10);
		tool3.update(2025, 15);

		printAtribute(tool1);
		printAtribute(tool2);
		printAtribute(tool3);
	}

}
