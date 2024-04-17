package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nombres = new String[5];

        System.out.println("Ingrese 5 nombres de personas:");

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = teclado.nextLine();
        }

        System.out.println("\nValores guardados en el array:");

        int indice = 0;
        while (indice < nombres.length) {
            System.out.println("Nombre " + (indice + 1) + ": " + nombres[indice]);
            indice++;
        }

        System.out.println("\nTamaño del array: " + nombres.length);

        byte indiceEliminar;
        do {
            System.out.print("\nIngrese el índice del elemento a eliminar (0-4): ");
            indiceEliminar = teclado.nextByte();
        } while (indiceEliminar < 0 || indiceEliminar >= nombres.length);

        for (int i = (int)indiceEliminar; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = null;  
        System.out.println("\nValores guardados en el array después de eliminar el elemento:");

        indice = 0;
        while (indice < nombres.length) {
            System.out.println("Nombre " + (indice + 1) + ": " + (nombres[indice] != null ? nombres[indice] : "Espacio en blanco"));
            indice++;
        }

        teclado.close();
    }
}
