package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++) {
			
            Pizza pizza = new Pizza();

            System.out.println("Ingrese los datos para la Pizza " + i + ":");

            System.out.print("Diametro (20 (pizza pequeña), 30 (pizza mediana) o 40 (pizza grande)): ");
            int diametro = Integer.parseInt(teclado.nextLine());
            pizza.setDiametro(diametro);

            System.out.print("Lleva ingredientes especiales? (true/false): ");
            boolean ingredientesEspeciales = Boolean.parseBoolean(teclado.nextLine());
            pizza.setIngredientesEspeciales(ingredientesEspeciales);
            
            pizza.calcularPrecio();
            pizza.calcularArea();
            
            System.out.println("\nDatos de la Pizza " + i + ":");
            System.out.println("Diametro: " + pizza.getDiametro());
            System.out.println("Precio: " + pizza.getPrecio());
            System.out.println("Area: " + pizza.getArea());
   }
		teclado.close();
}
}