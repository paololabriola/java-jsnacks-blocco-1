package jsnacks;

import java.util.Scanner;

public class JSnack4 {

	public static void main(String[] args) {
		
		/*Crea un array di numeri interi
		e fai la somma di tutti gli elementi che sono in posizione dispari*/
		
		System.out.println("Questo codice andrà a calcolare la somma dei numeri in posizione dispari di un vettore inserito in input.");
		
		int dimensioneVettore, sommaDispari=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserisci la dimensione del vettore: ");
		dimensioneVettore = scan.nextInt();
		
		int[] vettore = new int[dimensioneVettore];
		
		
		for(int i = 0; i < dimensioneVettore; i++) {
			
			System.out.print("Inserisci il " + (i + 1) + "° numero del vettore: ");
			vettore[i] = scan.nextInt();
			
		}
		
		for(int i=0; i < dimensioneVettore; i++) {
			
			if(i % 2 != 0)
				sommaDispari = sommaDispari + vettore[i];
			
		}
		
		System.out.println("La somma dei numeri in posizione dispari del vettore è pari a: " + sommaDispari);
		
	}
	
}
