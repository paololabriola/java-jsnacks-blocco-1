package jsnacks;

import java.util.Scanner;

public class JSnack5 {
	
	public static void main(String[] args) {
		
		/*La distanza di Hamming tra due stringhe di uguale lunghezza è il numero
		di posizioni nelle quali i caratteri corrispondenti sono diversi.
		Chiedi all'utente di dirti due parole e stampa la distanza di Hamming.*/
		
		System.out.println("Questo codice ti restituisce in output la distanza di Hamming di due parole di ugual grandezza.");
		
		int differenze = 0;
		String parola1, parola2;
		Scanner scan = new Scanner(System.in);
		
		do {
			
		System.out.print("Inserisci due parole di egual dimensioni: ");
		parola1 = scan.nextLine();
		parola2 = scan.nextLine();
		
		if(parola1.length() != parola2.length())
			System.out.println("Le parole devono avere la stessa dimensione! Riprova.");
		
		}while(parola1.length() != parola2.length());
		
		int lunghezza = parola1.length();
		
		char[] caratteriParola1 = parola1.toCharArray();
		char[] caratteriParola2 = parola2.toCharArray();
		
		for(int i = 0; i < lunghezza; i++) {
			
			if(caratteriParola1[i] != caratteriParola2[i])
				differenze++;
			
		}
		
		System.out.println("La distanza di Hamming tra queste due parole è pari a: " + differenze);
		
		scan.close();
		
	}

}
