package de.schafhirte204.zufall;

/**
 * Generierung von Zufallszahlen
 */
public class GenerierungVonzufallszahlen {
    public static void main(String[] args){
        int[] zahlen = new int[10];
        for(int i=0;i<10;i++){
            zahlen[i]= (int) (Math.random()*2+2); //Math.random()*(max-min)+min
        }
        for(int i=0;i<10;i++){
            System.out.print(" "+zahlen[i]);
        }
    }
}
