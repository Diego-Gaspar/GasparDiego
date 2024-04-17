package ar.edu.unju.fi.ejercicio12.main;

import ar.edu.unju.fi.ejercicio12.model.Persona;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese el nombre de la persona: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (en formato dd/mm/aaaa): ");
        String fechaNacimientoStr = teclado.nextLine();
        String[] fechaParts = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(fechaParts[0]);
        int mes = Integer.parseInt(fechaParts[1]) - 1;
        int anio = Integer.parseInt(fechaParts[2]);
        Calendar fechaNacimiento = new GregorianCalendar(anio, mes, dia);
        
        Persona persona = new Persona(nombre, fechaNacimiento);
        
        System.out.println("\nDatos de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + dia + "/" + (mes + 1) + "/" + anio); 
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.obtenerSignoZodiaco());
        System.out.println("Estación: " + persona.obtenerEstacion());

        teclado.close();
	}
}
        
        
		
		



