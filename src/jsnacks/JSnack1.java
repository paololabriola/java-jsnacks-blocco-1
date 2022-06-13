package jsnacks;

import java.util.Scanner;

public class JSnack1 {

	public static void main(String[] args) {
		
		/* Il software deve chiedere per 5 volte all’utente di inserire un numero.
		Il programma stampa la somma di tutti i numeri inseriti.
		Esegui questo programma in due versioni, con il for e con il while. */

		System.out.println("Questo esercizio farà la somma di 5 numeri inseriti in input dall'utente.");
		
		int n /*numero da inserire in input*/, i = 0 /*indice/contatore*/, s = 0 /*somma numeri*/;
		Scanner scan = new Scanner(System.in); /*variabile scanner per prendere i valori in input*/
		
		/*for(i = 0; i < 5; i++) {
			
			System.out.print("Inserisci il " + (i + 1) + "° numero: ");
			n = scan.nextInt();
			s = s + n;
			
		}*/
		
		while(i < 5) {
			
			System.out.print("Inserisci il " + (i + 1) + "° numero: ");
			n = scan.nextInt();
			s = s + n;
			i++;
			
		}
		
		System.out.println("La somma dei numeri inseriti è pari a " + s);
		
		scan.close();
		
	}

}
