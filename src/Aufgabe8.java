import java.util.Scanner;

public class Aufgabe8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int auswahl, anzahl, bereichStart, bereichEnd;
		int[] zahlen;
		boolean fehler, weiter, neu;
		char mauswahl;

		// 1
		System.out.println("Erfassung und auswertung von zahlenreihen");

		do {
			neu = true;
			// 2
			do {
				fehler = false;
				System.out.print("Wollen sie mit eigenen Zahlen (1) oder mit Zufallszahlen (2) arbeiten");
				auswahl = in.nextInt();
				if (auswahl != 1 && auswahl != 2) {
					System.out.println("Bitte geben sie 1 oder 2 ein");
					fehler = false;
				}
			} while (fehler);

			// 3
			System.out.print("Wie viele Zahlen benötigen sie");
			anzahl = in.nextInt();
			zahlen = new int[anzahl];
			System.out.print("In welchem bereich ? von:");
			bereichStart = in.nextInt();
			System.out.print("                     bis:");
			bereichEnd = in.nextInt();

			if (auswahl == 1) {
				for (int i = 0; i < anzahl; i++) {
					do {
						fehler = false;
						System.out.print((i + 1) + ". Zahl: ");
						zahlen[i] = in.nextInt();
						if (zahlen[i] > bereichEnd || zahlen[i] < bereichStart) {
							System.out.println("Bitte Wiederholen sie die Eingabe");
							System.out.println("Bitte geben sie eine Zahl in ihrem bereich ein.");
							fehler = true;
						}
					} while (fehler);
				}
			} else {
				for (int i = 0; i < anzahl; i++) {
					zahlen[i] = (int) (Math.random() * (bereichEnd - bereichStart + 1) + bereichStart);
				}

			}
			do {
				weiter = true;

				System.out.println("Folgende Aktionen sthen zur Verfügung:");
				System.out.println("(A/a) - Anzaige der Zahlen");
				System.out.println("(K/k) - Ermittlung der kleinsten Zahl");
				System.out.println("(G/g) - Ermittlung der größten Zahl");
				System.out.println("(M/m) - Berechnung des Mittelwertes");
				System.out.println("(E/e) - Ende");
				System.out.print("Ihre Wahl:");

				mauswahl = in.next().charAt(0);

				switch (mauswahl) {
				case 'A':
				case 'a':
					for (int i = 0; i < anzahl; i++) {
						System.out.println(zahlen[i]);
					}
					break;
				case 'K':
				case 'k':
					int ausgabe = 999999999;
					for (int z : zahlen) {
						if (z < ausgabe) {
							ausgabe = z;
						}

					}
					System.out.println("Die Kleinste zahl ist: " + ausgabe);
					break;
				case 'G':
				case 'g':
					int ausgabeg = 0;
					for (int z : zahlen) {
						if (z > ausgabeg) {
							ausgabeg = z;
						}

					}
					System.out.println("Die Größte zahl ist: " + ausgabeg);
					break;
				case 'M':
				case 'm':
					int ausgabem = 0;
					for (int z : zahlen) {
						ausgabem = ausgabem + z;
					}
					ausgabem = ausgabem / anzahl;
					System.out.println("Der Mittelwer ist: " + ausgabem);
					break;
				case 'E':
				case 'e':
					weiter = false;
					do {
						fehler = false;
						System.out.print("Wollen Sie das Programm für eie neue Zahlenreihe starten(J/N)");
						mauswahl = in.next().charAt(0);
						if (mauswahl == 'J') {

						} else if (mauswahl == 'N') {
							neu = false;
						} else {
							System.out.println("Bitte geben sie J oder N ein");
							fehler = true;
						}

					} while (fehler);

				default:
					break;
				}
			} while (weiter);
		} while (neu);
		in.close();
	}
}
