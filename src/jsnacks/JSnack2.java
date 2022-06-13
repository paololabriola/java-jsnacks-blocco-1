package jsnacks;

import java.util.Scanner;

public class JSnack2 {

	public static void main(String[] args) {
		
		/*Chiedi all'utente di inserire un numero, se è pari stampa il numero,
		se è dispari stampa il numero successivo*/
		System.out.println("Questo codice partendo da un numero inserito in input stamperà il numero pari più vicino a esso.");
		int n /*numero inserito in input*/;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		n = scan.nextInt();
		
		if(n % 2 == 0)
			System.out.println("Il numero diventa " + n);
		else
			System.out.println("Il numero diventa " + (n+1));
		
		scan.close();
		
	}

}
