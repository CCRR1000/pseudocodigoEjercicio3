/*
   3. El factorial de un número entero se denota de la siguiente manera «n!» y su resultado es n!=n*(n-1)*(n-2)*…*1. 
   Por ejemplo: 5!=5*4*3*2*1 siendo el resultado 120. Se pide desarrollar un programa que lee un valor N y determine su factorial.
*/

import java.util.*;

public class Ejercicio3 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int N, factorial=1;

		System.out.print("\nIngrese un numero: ");
		N = read.nextInt();

		while (N>0) {
			factorial *= N;
			N--;
		}

		System.out.println("\n   El factorial es " + factorial + "\n");
	}


}

