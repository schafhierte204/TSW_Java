package de.schafhirte204;

import java.util.Scanner;

/**
 * Einfach Aufgabe mit ein und Ausgaben
 */
public class MiniTaschenrechner {
    public  static void main(String[] args){

        int a,b;
        String name;

        Scanner in = new Scanner(System.in);

        System.out.println("*******************");
        System.out.println("MINI-TASCHENRECHNER");
        System.out.println("*******************");
        System.out.println();
        System.out.print("Geben Sie die 1. Zahl ein: ");
        a = in.nextInt();
        System.out.print(" . . und nun die 2. Zahl: ");
        b = in.nextInt();
        System.out.println();
        System.out.println("Hier kommen Ihre Ergebnisse");
        System.out.println("***************************");
        System.out.println("| "+a+" + "+b+" = "+(a+b));
        System.out.println("| "+a+" - "+b+" = "+(a-b));
        System.out.println("| "+a+" * "+b+" = "+(a*b));
        System.out.println("| "+a+" / "+b+" = "+((float) a/b));
        System.out.println("| "+a+" ^ "+b+" = "+Math.pow(a,b));
        System.out.println("***************************");
        System.out.println("Bitte geben sie nun ihren Namen ein: ");
        in.nextLine();
        name = in.nextLine();
        System.out.println(name+", Dein erstes JAVA-Programm funktioniert");
        in.close();
    }
}
