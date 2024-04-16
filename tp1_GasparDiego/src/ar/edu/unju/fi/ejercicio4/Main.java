package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese numero a sacar el factorial (entre 1 al 10)");
		int numero = teclado.nextInt();
		int i = 1;
		int factorial = 1;
		
		//metodo para sacar el factorial
		
		if (numero>=0 && numero<=10) {
			while (i<=numero) {
				factorial *= i;
				i ++;
			}
			System.out.println("El factorial de " + numero + " es: " + factorial);
		} else {
			System.out.println("No ingreso un numero entre 1 y 10");
		}
		teclado.close();
	}

}
