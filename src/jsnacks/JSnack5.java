package jsnacks;

import java.util.Scanner;

public class JSnack5 {
	
	public static void main(String[] args) {
		
		/*La distanza di Hamming tra due stringhe di uguale lunghezza è il numero
		di posizioni nelle quali i caratteri corrispondenti sono diversi.
		Chiedi all'utente di dirti due parole e stampa la distanza di Hamming.*/
		
		System.out.println("Questo codice ti restituisce in output la distanza di Hamming di due parole di ugual grandezza.");
		
		int dimensioneParola;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci la dimensione della parola: ");
		dimensioneParola = scan.nextInt();
		
		
		
		scan.close();
		
	}

}
