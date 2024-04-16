package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese numero (entre 1 al 9)");
		int numero = teclado.nextInt();
		
		//metodo para realizar la tabla de multiplicar
		
		if (numero>=1 && numero<=9) {
			for (int i = 1; i <= 10; i++) {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }
		}
		else {
			System.out.println("Ingreso numero no valido");
		}
			System.out.println("Esta es la tabla de multiplicar de: " + numero);
			teclado.close();
	}
	}