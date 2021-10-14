package de.schafhirte204.Arrays;

import java.util.Scanner;

/**
 * Komplexere Aufgabe mit schleifen
 */
public class EinmaleinsQuadrat {
    public static void main(String[] args)
    {
        int a,b;
        Scanner in = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("* Das kleine Einmaleins *");
        System.out.println("*************************");
        System.out.println();
        
        //Eingabe
        System.out.print("Wie viele Spalten?: ");
        a = in.nextInt();
        System.out.print("Wie viele Zeilen?: ");
        b = in.nextInt();
        System.out.print("     ");
        
        for(int i = 1;i<=a;i++)
        {
            System.out.print(i+" | ");
        }
        System.out.println();
        System.out.print("----");
        for(int i = 0;i<a;i++)
        {
           System.out.print("----");
        }
        System.out.println();
        for(int i = 1;i<=b;i++)
        {
            System.out.print(i+" |");
            for(int j =1;j<=a;j++)
            {
                System.out.print(" "+(j*i)+" |");
            }
            System.out.println();
        }
        in.close();
    }
}
