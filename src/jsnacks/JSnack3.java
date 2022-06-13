package jsnacks;

import java.util.Random;
import java.util.Scanner;

public class JSnack3 {

	public static void main(String[] args) {
		
		/*Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una
		lista di cognomi, genera una falsa lista di 3 invitati.*/
		
		int nNomiCognomi;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Questo codice mischierà un nome e cognome casualmente a partire da nomi e cognomi dati in input.");
		
		System.out.print("Inserisci quanti nomi e cognomi vuoi inserire: ");
		nNomiCognomi = scan.nextInt();
		
		String[] nomi = new String[nNomiCognomi];
		String[] cognomi = new String[nNomiCognomi];
		
		scan.nextLine();
		
		for(int i = 0; i < nNomiCognomi; i++) {
			
			System.out.print("Inserisci il " + (i + 1) + "° nome: ");
			nomi[i] = scan.nextLine();
			
		}
		
		for(int i = 0; i < nNomiCognomi; i++) {
			
			System.out.print("Inserisci il " + (i + 1) + "° cognome: ");
			cognomi[i] = scan.nextLine();
			
		}
		
		Random rand = new Random();
		
		for(int i = 0; i < 3; i++) {
			
		int nRandomizzato = rand.nextInt(nNomiCognomi);
		int cRandomizzato = rand.nextInt(nNomiCognomi);
		System.out.println("Il nome del " + (i + 1) + "° invitato è " + nomi[nRandomizzato] + cognomi[cRandomizzato]);
		
		}
		
		scan.close();
		
	}
	
}
