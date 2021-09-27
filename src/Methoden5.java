import java.util.Scanner;

public class Methoden5 {
	static int max(int[] zahlen) {
		int maxzahl = zahlen[0];
		for (int z : zahlen) {
			if (z > maxzahl) {
				maxzahl = z;
			}
		}
		return maxzahl;
	}

	static int min(int[] zahlen) {
		int minzahl = zahlen[0];
		for (int z : zahlen) {
			if (z < minzahl) {
				minzahl = z;
			}
		}
		return minzahl;
	}

	static int average(int[] zahlen) {
		int summe = 0;
		for (int z : zahlen) {
			summe = summe + z;
		}
		return summe / zahlen.length;
	}

	static int modal(int[] zahlen) {
		int[] anzahl = new int[10];
		int max = 0;
		int erg = 0;
		for (int z : zahlen) {
			anzahl[z]++;
		}
		for (int i=0;i<10;i++) {
			if(anzahl[i]>max) {
				erg=i;
				max=anzahl[i];
			}
		}
		return erg;
	}

	static int spannweite(int[] zahlen) {
		return max(zahlen)-min(zahlen);
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char wahl;
		int anzahl;
		System.out.println("Wiefiele Zahlen wollen sie auswerten");
		anzahl = in.nextInt();

		int[] zahlen = new int[anzahl];

		do {
			for (int i = 0; i < anzahl; i++) {
				zahlen[i] = (int) (Math.random() * 10);
			}

			do {
				System.out.println(
						"Wollen sie das maxum(A/a), das minimum(I/i), den Duchschnitt(D/d), die Spannweite(S/s) oder Den Modalwert(M/m) berechnen?");
				wahl = in.next().charAt(0);
				System.out.println();
				switch (wahl) {
				case 'A':
				case 'a':
					System.out.println("Das Maximum beträgt: " + max(zahlen));
					break;
				case 'I':
				case 'i':
					System.out.println("Das Minimum berträgt: " + min(zahlen));
					break;
				case 'D':
				case 'd':
					System.out.println("Der Durchschnitt beträgt: " + average(zahlen));
					break;
				case 'M':
				case 'm':
					System.out.println("Der Modalwert beträgt: " + modal(zahlen));
					break;
				case 'S':
				case 's':
					System.out.println("Die Spannweite beträgt: " +spannweite(zahlen));
				default:
					System.out.println("Bitte geben sie eine gültige auswahl ein");
				}
				System.out.println("Wollen sie noch eine auswertung machen(j/n)");
				wahl = in.next().charAt(0);
			} while (wahl == 'j');
			System.out.println("Wollen sie eine weitere analyse machen(j/n)");
			wahl = in.next().charAt(0);
		} while (wahl == 'j');
		in.close();
	}

}
