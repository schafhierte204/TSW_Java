package de.schafhierte204;
import java.util.Scanner;

public class Plaindrom {

	static boolean isPalindrom(String wort) {
		int lange = wort.length();
		boolean palindrom = true;
		for (int i = 0; i < lange / 2; i++) {
			if (wort.charAt(i) != wort.charAt(lange-i-1)) {
				palindrom = false;
			}
		}
		return palindrom;
	}

	static String backwards(String wort) {
		String umgedreht = "";
		for(int i=wort.length()-1;i>=0;i--) {
			umgedreht=umgedreht+wort.charAt(i);
		}
		return umgedreht;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String wort1, wort2;
		boolean nochmal;

		System.out.println("kleine Wortanalyse");
		System.out.println("------------------");
		System.out.println();
		System.out.print("Geben Sie ein Wort ein: ");
		wort1 = in.next();
		System.out.println("Das 1. Wort ist " + wort1.length() + " Zeichen lang!");
		do {
			System.out.println();
			System.out.print("Geben Sie ein 2. Wort ein: ");
			wort2 = in.next();
			nochmal = wort1.equals(wort2);
			if (nochmal) {
				System.out.println("Das ist das gleiche Wort --> nochmal!");
			}
		} while (nochmal);
		System.out.println("Das 2. Wort ist " + wort2.length() + " Zeichen lang!");
		System.out.println();
		if (isPalindrom(wort1)) {
			System.out.println("Das 1. Wort ist ein Palindrom!");
		} else {
			System.out.print(wort1 + " und "+backwards(wort1)+" sind keine Palindrome");
			System.out.println(" sind keine Palindrome");
		}
		System.out.println();
		if (isPalindrom(wort2)) {
			System.out.println("Das 2. Wort ist ein Palindrom!");
		} else {
			System.out.println(wort2 + " und "+backwards(wort2)+" sind keine Palindrome");
		}
		in.close();
	}
}
