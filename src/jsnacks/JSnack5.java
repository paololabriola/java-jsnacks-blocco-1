package jsnacks;

import java.util.Scanner;

public class JSnack5 {
	
	public static void main(String[] args) {
		
		/*La distanza di Hamming tra due stringhe di uguale lunghezza è il numero
		di posizioni nelle quali i caratteri corrispondenti sono diversi.
		Chiedi all'utente di dirti due parole e stampa la distanza di Hamming.*/
		
		System.out.println("Questo codice ti restituisce in output la distanza di Hamming di due parole di ugual grandezza.");
		
		String parola1, parola2;
		Scanner scan = new Scanner(System.in);
		
		do {
			
		System.out.print("Inserisci due parole di egual dimensioni: ");
		parola1 = scan.nextLine();
		parola2 = scan.nextLine();
		
		if(parola1.length() != parola2.length())
			System.out.println("Le parole devono avere la stessa dimensione! Riprova.");
		
		}while(parola1.length() != parola2.length());
		
		
		
		scan.close();
		
	}

}
