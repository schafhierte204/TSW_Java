package de.schafhirte204.zufall;

import java.util.Scanner;

/**
 * Erweiterte Aufgabe zu Zufallszahlen
 */
public class ZufallImQuadrat {
    public static void main(String[] args)
    {
        int gros,start,ende;
        int[] zufall;
        Scanner in = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("* Zufall, Nichts als Zufall im Quadrat *");
        System.out.println("****************************************");
        System.out.println();
        System.out.print("Wie groß (zxz) soll Ohr Zufallszahlenquadrat werden? ");
        gros= in.nextInt();
        zufall = new int[gros*gros];
        System.out.println();
        System.out.print("Zufallszahlen im Bereich von: ");
        start = in.nextInt();
        System.out.print("                         bis: ");
        ende = in.nextInt();
        for (int i =0;i<gros*gros;i++){
            zufall[i]=(int) (Math.random()*(ende-start+1)+start);
        }
        System.out.println();
        System.out.println("Da sind Ihre Zufallszahlen:");
        System.out.println("---------------------------");
        int k =0;
        for(int i = 0;i<gros;i++)
        {
            System.out.println();
            System.out.println();
            for(int j=0;j<gros;j++)
            {
                System.out.print(zufall[k]+"      ");
                k++;
            }
            System.out.println();
        }
        in.close();
    }
}
