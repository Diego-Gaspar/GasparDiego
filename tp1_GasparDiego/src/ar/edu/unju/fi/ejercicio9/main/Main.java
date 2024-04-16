package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++) {
            Producto producto = new Producto();

            System.out.println("Ingrese los datos para el Producto " + i + ":");

            System.out.print("Nombre: ");
            producto.setNombre(teclado.nextLine());

            System.out.print("Código: ");
            producto.setCodigo(teclado.nextLine());

            System.out.print("Precio: ");
            producto.setPrecio(Double.parseDouble(teclado.nextLine()));

            System.out.print("Descuento (%): ");
            producto.setDescuento(Integer.parseInt(teclado.nextLine()));
            
            System.out.println("\nDatos del Producto " + i + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            System.out.println("Precio con Descuento: " + producto.calcularDescuento());
        }

        teclado.close();
    }
}	


