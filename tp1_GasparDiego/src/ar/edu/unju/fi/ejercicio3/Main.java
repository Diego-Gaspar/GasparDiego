package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("ingrese un numero entero: ");
		int numero = teclado.nextInt();
		
		//metodo para accionar a un numero par o impar
		
		if (numero % 2 == 0) {
			numero = numero * 3;
            System.out.println("Es un número par " + "y multiplicado por 3 seria: " + numero);
        } else {
        	numero = numero * 2;
            System.out.println("Es un número impar " + "y multiplicado por 2 seria: " + numero);
        }
		teclado.close();
	}

}
