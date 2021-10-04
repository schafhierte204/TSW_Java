import java.util.Scanner;

//Jens Hafemann I-15
public class JensHafemann_1 {

	public static void main(String[] args) {
		int[] zahlen = new int[8];
		Scanner in = new Scanner(System.in);
		char wahl;
		int rateZahl;
		boolean gefunden;
//--------------------------------------------------------
		System.out.println("Zahlen aus einer Reihe raten");
		System.out.println("****************************");
//-------------------------------- A1: 2/2 ----------------
		do {
			for (int i = 0; i < 8; i++) {
				zahlen[i] = (int) (Math.random() * 6 + 5); //Sechs mögliche Zahlen die bei 5 anfangen
			}
//------------------------------ A2: 9/9 ---------------------
			
			System.out.println();
			System.out.println("Was wollen Sie erraten:");
			System.out.println("(E/e) - Wie lautet die erste Zahl?");
			System.out.println("(L/l) - Wie lautet die letzte Zahl?");
			System.out.println("(D/d) - Welche Zahl ist garantiert dabei?");
			System.out.print("Ihre Wahl: ");
			wahl = in.next().charAt(0);
//------------------------------ A3: 8/8 -------------------
			
			System.out.println();
			System.out.print("Dann geben Sie mal die Zahl ein: ");
			rateZahl = in.nextInt();
			System.out.println();

			switch (wahl) {
			case 'E':
			case 'e':
				if (zahlen[0] == rateZahl) {
					System.out.println("Diese Runde haben Sie gewonnen!");
				} else {
					System.out.println("Diese Runde haben Sie verloren!");
				}
				break;
			case 'L':
			case 'l':
				if (zahlen[7] == rateZahl) {
					System.out.println("Diese Runde haben Sie gewonnen!");
				} else {
					System.out.println("Diese Runde haben Sie verloren!");
				}
				break;
			case 'D':
			case 'd':
				gefunden = false;
				for (int z : zahlen) {
					if (z == rateZahl) {
						gefunden = true;
						break;
					}
				}
				if (gefunden) {
					System.out.println("Diese Runde haben Sie gewonnen!");
				} else {
					System.out.println("Diese Runde haben Sie verloren!");
				}
				break;
			}
//--------------------------  A4: 17/17 --------------------------------			

			System.out.println();
			System.out.println("Vergleichen Sie selbst:");
			for (int z : zahlen) {
				System.out.print(z + "  ");
			}
//---------------------------- A5: 2/2 ---------------------			
			System.out.println();
			System.out.println();
			System.out.print("Nochmal von vorn(J/N) ?");
			wahl = in.next().charAt(0);
		} while (wahl == 'J' || wahl == 'j');
//--------------------------- A6: 4/4 ------------------------
		
		in.close();
	}

}

//---------------------------- Programm:  42/42
//-------------------------------s/l:      3/3

// vielleicht noch Leerzeilen vor/ nach Kontrollstrukturen?
// Wie könnte man die Dopplungen im Quelltext (… verloren… gewonnen…) elegant vermeiden?

//---- 45/45  --  100%  -->  Note: 1+
