package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese variable 1: ");
		int var1 = teclado.nextInt();
		System.out.println("ingrese variable 2: ");
		int var2 = teclado.nextInt();
		System.out.println("ingrese variable 3: ");
		int var3 = teclado.nextInt();
		System.out.println("ingrese variable 4: ");
		int var4 = teclado.nextInt();
		System.out.println("ingrese variable 5: ");
		int var5 = teclado.nextInt();
		int promedio = (var1 + var2 + var3 + var4 + var5) / 5;
		System.out.println("el promedio de: " + var1 + "," + var2  + "," + var3  + "," + var4  + "," + var5 + " es: " + promedio);
		
	}

}