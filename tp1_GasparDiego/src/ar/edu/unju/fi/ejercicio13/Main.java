package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[8];

        System.out.println("Ingrese 8 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("\nValores almacenados en el array:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        teclado.close();
    }
}

