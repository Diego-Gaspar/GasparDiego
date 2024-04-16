package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		 Persona persona1 = new Persona();
		 
		 //La construcción de un objeto "1" utilizando el constructor por defecto
		 
		    System.out.println("Ingrese DNI:");
	        persona1.setDni(teclado.next());
	        System.out.println("Ingrese nombre:");
	        persona1.setNombre(teclado.next());
	        System.out.println("Ingrese fecha de nacimiento (aaaa-mm-dd):");
	        persona1.setFechaNacimiento(LocalDate.parse(teclado.next()));
	        System.out.println("Ingrese provincia:");
	        persona1.setProvincia(teclado.next());
	        persona1.mostrarDatos();
	        
	      //La construcción de un objeto "2" utilizando el constructor parametrizado
	        
	        System.out.println("\nIngrese DNI:");
	        String dni = teclado.next();
	        System.out.println("Ingrese nombre:");
	        String nombre = teclado.next();
	        System.out.println("Ingrese fecha de nacimiento (aaaa-mm-dd):");
	        LocalDate fechaNacimiento = LocalDate.parse(teclado.next());
	        System.out.println("Ingrese provincia:");
	        String provincia = teclado.next();
	        Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
	        persona2.mostrarDatos();
	        
	      //La construcción de un objeto "3" utilizando el constructor que lleva como parámetros el dni, nombre y fecha de nacimiento
	        
	        System.out.println("\nIngrese DNI:");
	        dni = teclado.next();
	        System.out.println("Ingrese nombre:");
	        nombre = teclado.next();
	        System.out.println("Ingrese fecha de nacimiento (aaaa-mm-dd):");
	        fechaNacimiento = LocalDate.parse(teclado.next());
	        Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
	        persona3.mostrarDatos();

	        teclado.close();
	    }
}


