package de.schafhirte204.Arrays;

import java.util.Objects;
import java.util.Scanner;

/**
 * Komplexe Aufgabe mit Arrays
 */
public class EinmaleinsLernen {
    public static void main(String[] args) {
        int reihe, lang, pos;
        int fehler;
        String abfrage;

        Scanner in = new Scanner(System.in);

        System.out.println("***********************************");
        System.out.println("* Das kleine Einmaleins als Reihe *");
        System.out.println("***********************************");
        System.out.println();
        System.out.print("An welcher Reihe wollen Sie üben?: ");
        reihe = in.nextInt();
        System.out.print("und wie lang soll die Reihe sein?: ");
        lang = in.nextInt();
        int[] zahlen = new int[lang];
        System.out.println("Geben sie nun " + lang + " aufeinander folgende Zahlen der " + reihe + "er Reihe ein!");
        for (int i = 0; i < lang; i++) {
            zahlen[i] = in.nextInt();
        }
        do {

            System.out.println();
            System.out.print("Das sind Ihre Zahlen: ");
            for (int i = 0; i < lang; i++) {
                System.out.print(zahlen[i] + " ");
            }
            System.out.println();
            System.out.print("-und das ist richtig: ");
            for (int i = 1; i <= lang; i++) {
                System.out.print((i * reihe) + " ");
            }
            System.out.println();
            fehler = 0;
            //Fehler ermitteln
            for (int i = 0; i < lang; i++) {
                if (zahlen[i] != ((i + 1) * reihe)) {
                    fehler++;
                }
            }
            System.out.println("Sie haben " + fehler + " Fehler");
            if (fehler > 0) {
                System.out.println("Möchten sie diese Korrigieren?");

                in.nextLine();
                abfrage = in.nextLine();
                if (Objects.equals(abfrage, "ja")) {
                    System.out.print(" Welche position? ");
                    pos = in.nextInt();
                    System.out.print("Bitte geben sie eine neue zahl für die position ein");
                    zahlen[pos-1] = in.nextInt();
                } else {
                    fehler = 0;
                }
            }
        } while (fehler > 0);
        in.close();
    }
}
