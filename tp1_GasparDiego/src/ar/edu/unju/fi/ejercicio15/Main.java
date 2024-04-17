package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tamanioArray;
        do {
            System.out.print("Ingrese un número entero en el rango [5, 10] según el tamaño de array que quiera: ");
            tamanioArray = teclado.nextInt();
        } while (tamanioArray < 5 || tamanioArray > 10);

        String[] nombres = new String[tamanioArray];

        for (int i = 0; i < nombres.length; i++) {
            teclado.nextLine();
            System.out.print("Ingrese el nombre de la persona para la posición " + i + ": ");
            nombres[i] = teclado.nextLine();
        }

        System.out.println("\nContenido del array (comenzando desde el primer índice):");

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        System.out.println("\nContenido del array (comenzando desde la última posición):");

        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        teclado.close();
    }
}
