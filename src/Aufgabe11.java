import java.util.Scanner;

public class Aufgabe11 {
	static void titel(int unterstriche) {
		System.out.println("Herzlich Willkommen");
		for (int i = 0; i < unterstriche; i++) {
			System.out.println("-------------------");
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int striche;
		System.out.print("W�hlen sie die Anzahl der Unterstreichungen f�r die �berschrift: ");
		striche = in.nextInt();

		titel(striche);
		in.close();

	}

}
