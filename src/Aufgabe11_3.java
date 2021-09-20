import java.util.Scanner;

public class Aufgabe11_3 {
	static void kugel(double radius) {
		double volumen;
		volumen = 4 / 3 * Math.PI * Math.pow(radius, 3);
		System.out.println("Kugel:");
		System.out.println("Das Volumen beträgt: " + volumen);

	}

	static void halbkugel(double radius) {
		double volumen;
		volumen = 2 / 3 * Math.PI * Math.pow(radius, 3);
		System.out.println("Halbkugel:");
		System.out.println("Das Volumen beträgt: " + volumen);

	}

	static void zylinder(double radius, double lange) {
		double volumen;
		volumen = Math.PI * Math.pow(radius, 2) * lange;
		System.out.println("Zylinder:");
		System.out.println("Das Volumen beträgt: " + volumen);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		char wahl;
		double radius, lange;

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
			kugel(radius);
			break;
		case 'H':
		case 'h':
			System.out.print("Geben sie den Radius ein: ");
			radius = in.nextDouble();
			System.out.println();
			halbkugel(radius);
			break;
		case 'Z':
		case 'z':
			System.out.print("Geben sie den Radius ein: ");
			radius = in.nextDouble();
			System.out.print("Geben sie die Höhe ein: ");
			lange = in.nextDouble();
			System.out.println();
			zylinder(radius, lange);
			break;

		}

		in.close();
	}

}
