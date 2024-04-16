package ar.edu.unju.fi.ejercicio7.main;

import ar.edu.unju.fi.ejercicio7.model.Empleado;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		 System.out.println("Ingrese el nombre del empleado:");
	     String nombre = teclado.nextLine();

	     System.out.println("Ingrese el legajo del empleado:");
	     int legajo = teclado.nextInt();

	     System.out.println("Ingrese el salario del empleado:");
	     double salario = teclado.nextDouble();

	     Empleado empleado = new Empleado(nombre, legajo, salario);
	     System.out.println("\nDatos del empleado:");
	     empleado.mostrarDatos();
	     
	     empleado.darAumento();

	     System.out.println("\nDespués del aumento:");
	     empleado.mostrarDatos();

	     teclado.close();
	    }
	}
