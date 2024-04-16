package ar.edu.unju.fi.ejercicio8.main;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de n:");
		int n = teclado.nextInt();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial(n);
		
		System.out.println("La sumatoria es: " + calculadora.calcularSumatoria());
	    System.out.println("La productoria es: " + calculadora.calcularProductoria());

	    teclado.close();
	    }	 
	}
