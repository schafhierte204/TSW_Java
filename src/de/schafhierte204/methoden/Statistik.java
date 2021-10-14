package de.schafhierte204.methoden;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Aufgabe zu Arrays in Methoden
 */
public class Statistik {
    static double max(int[] zahlen) {
        double maxZahl = zahlen[0];
        for (double z : zahlen) {
            if (z > maxZahl) {
                maxZahl = z;
            }
        }
        return maxZahl;
    }

    static double min(int[] zahlen) {
        double minZahl = zahlen[0];
        for (double z : zahlen) {
            if (z < minZahl) {
                minZahl = z;
            }
        }
        return minZahl;
    }

    static double average(int[] zahlen) {
        double summe = 0;
        for (double z : zahlen) {
            summe = summe + z;
        }
        return summe / zahlen.length;
    }

    static double modal(int[] zahlen) {
        int[] anzahl = new int[10];
        double max = 0;
        double erg = 0;
        for (int z : zahlen) {
            anzahl[z]++;
        }
        for (int i = 0; i < 10; i++) {
            if (anzahl[i] > max) {
                erg = i;
                max = anzahl[i];
            }
        }
        return erg;
    }

    static double median(int[] zahlen) {
        Arrays.sort(zahlen);
        if (zahlen.length % 2 == 0) {
            // Gerade
            return ((double) zahlen[zahlen.length / 2] + zahlen[zahlen.length / 2 + 1]) / 2;
        } else {
            // Ungerade
            return zahlen[zahlen.length / 2 + 1];
        }
    }

    static double spannweite(int[] zahlen) {
        return max(zahlen) - min(zahlen);

    }

    static double standardAbweichung(int[] zahlen) {
        double durchschnitt = average(zahlen);
        double acc = 0;
        for (double z : zahlen) {
            acc += Math.pow((z - durchschnitt), 2);
        }
        acc = 1d / (zahlen.length - 1) * acc;
        return Math.sqrt(acc);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char wahl;
        int anzahl;
        boolean fehler;

        System.out.println("Wie fiele Zahlen wollen sie auswerten");
        anzahl = in.nextInt();

        int[] zahlen = new int[anzahl];

        do {
            for (int i = 0; i < anzahl; i++) {
                zahlen[i] = (int) (Math.random() * 10);
            }
            System.out.println(Arrays.toString(zahlen));

            do {
                System.out.println(
                        "Wollen sie Lagemaße(L/l), Arithmetische Analysen(A/a), oder Streuungsmaße(S/s) berechnen?");
                wahl = in.next().charAt(0);
                System.out.println();
                if (wahl == 'A' || wahl == 'a') {
                    System.out.println("Wollen sie Das Maximum(A/a) oder das Minimum(I/i) berechnen?");
                    do {
                        fehler = false;
                        wahl = in.next().charAt(0);
                        System.out.println();
                        if (wahl == 'A' || wahl == 'a') {
                            System.out.println("Das Maximum beträgt: " + max(zahlen));
                        } else if (wahl == 'I' || wahl == 'i') {
                            System.out.println("Das Minimum beträgt: " + min(zahlen));
                        } else {
                            System.out.println("Bitte geben sie A/a oder I/i ein");
                            fehler = true;
                        }
                    } while (fehler);
                } else if (wahl == 'L' || wahl == 'l') {
                    System.out.println(
                            "Wollen sie Das Arithmetische Mittel(D/d), Den Median(M/m), Den Modalwert(O/o) oder alles(A/a) berechnen?");
                    System.out.println();
                    do {
                        fehler = false;
                        wahl = in.next().charAt(0);
                        System.out.println();
                        switch (wahl) {
                            case 'D':
                            case 'd':
                                System.out.println("Der Durchschnitt beträgt: " + average(zahlen));
                                break;
                            case 'O':
                            case 'o':
                                System.out.println("Der Modalwert beträgt: " + modal(zahlen));
                                break;
                            case 'M':
                            case 'm':
                                System.out.println("Der Medial beträgt: " + median(zahlen));
                                break;
                            case 'A':
                            case 'a':
                                System.out.println("Der Durchschnitt beträgt: " + average(zahlen));
                                System.out.println("Der Modalwert beträgt: " + modal(zahlen));
                                System.out.println("Der Medial beträgt: " + median(zahlen));
                                break;
                            default:
                                System.out.println("Bitte geben sie eine gültige auswahl ein");
                                fehler = true;
                        }
                    } while (fehler);
                } else if (wahl == 'S' || wahl == 's') {
                    System.out.println("Wollen sie Die Spannweite(R/r) oder die Standardabweichung(S/s) berechnen?");
                    System.out.println();
                    do {
                        fehler = false;
                        wahl = in.next().charAt(0);
                        System.out.println();
                        switch (wahl) {
                            case 'S':
                            case 's':
                                System.out.println("Die Standardabweichung beträgt: " + standardAbweichung(zahlen));
                                break;
                            case 'R':
                            case 'r':
                                System.out.println("Der Spannweite beträgt: " + spannweite(zahlen));
                                break;
                            default:
                                System.out.println("Bitte geben sie eine gültige auswahl ein");
                                fehler = true;
                        }
                    } while (fehler);
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
