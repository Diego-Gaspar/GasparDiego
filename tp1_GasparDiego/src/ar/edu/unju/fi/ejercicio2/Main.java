package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//metodo para pedir datos y luego imprimirlos por consola
		
		System.out.println("ingrese nombre del país: ");
		String país = teclado.next();
		
		System.out.println("ingrese edad: ");
		int edad = teclado.nextInt();
		
		System.out.println("ingrese la altura de metros del edificio : ");
		int alturaEdificio = teclado.nextInt();
		
		System.out.println("ingrese el precio del producto: ");
		float precioProducto = teclado.nextFloat();
		
		System.out.println("ingrese numero de telefono: ");
		String numeroTelefono = teclado.next();
		
		double angulo = 0.5;
        double coseno = Math.cos(angulo);
		
		System.out.println("El nombre del país registrado es: " + país );
		System.out.println("La edad registrada de la persona es: " + edad + " años");
		System.out.println("La altura del edificio registrada es: " + alturaEdificio + "m");
		System.out.println("El precio del producto registrado es: " + precioProducto + "$" );
		System.out.println("El numero de telefono registrado es: " + numeroTelefono );
        System.out.println("El coseno de 0.5 es: " + coseno);

		teclado.close();
	}

}
