package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tamanioArray;
        do {
            System.out.print("Ingrese un número entero en el rango [3, 10] según el tamaño de array quiera: ");
            tamanioArray = teclado.nextInt();
        } while (tamanioArray < 3 || tamanioArray > 10);

        int[] arrayEnteros = new int[tamanioArray];

        for (int i = 0; i < arrayEnteros.length; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            arrayEnteros[i] = teclado.nextInt();
        }

        System.out.println("\nValores almacenados en el array:");

        for (int i = 0; i < arrayEnteros.length; i++) {
            System.out.println("Posición " + i + ": " + arrayEnteros[i]);
        }

        int suma = 0;
        for (int valor : arrayEnteros) {
            suma += valor;
        }

        System.out.println("\nLa suma de todos los valores del array es: " + suma);

        teclado.close();
    }
}
