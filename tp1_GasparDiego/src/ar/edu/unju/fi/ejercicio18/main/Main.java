package ar.edu.unju.fi.ejercicio18.main;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pais> paises = new ArrayList<>();
        ArrayList<DestinoTuristico> destinos = new ArrayList<>();

        paises.add(new Pais(1, "Argentina"));
        paises.add(new Pais(2, "Brasil"));
        paises.add(new Pais(3, "Chile"));

        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de destino turístico");
            System.out.println("2 - Mostrar todos los destinos turísticos");
            System.out.println("3 - Modificar el país de un destino turístico");
            System.out.println("4 - Limpiar el ArrayList de destino turísticos");
            System.out.println("5 - Eliminar un destino turístico");
            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 - Mostrar todos los países");
            System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 - Salir");
            System.out.print("Ingrese su opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (opcion) {
                    case 1:
                        altaDestinoTuristico(scanner, paises, destinos);
                        break;
                    case 2:
                        mostrarDestinosTuristicos(destinos);
                        break;
                    case 3:
                        modificarPaisDestinoTuristico(scanner, paises, destinos);
                        break;
                    case 4:
                        destinos.clear();
                        System.out.println("ArrayList de destinos turísticos limpiado.");
                        break;
                    case 5:
                        eliminarDestinoTuristico(scanner, destinos);
                        break;
                    case 6:
                        mostrarDestinosOrdenados(destinos);
                        break;
                    case 7:
                        mostrarTodosPaises(paises);
                        break;
                    case 8:
                        mostrarDestinosPorPais(scanner, destinos);
                        break;
                    case 9:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 9.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.nextLine(); 
                opcion = 0; 
            }
        } while (opcion != 9);

        scanner.close();
    }

    private static void altaDestinoTuristico(Scanner scanner, ArrayList<Pais> paises, ArrayList<DestinoTuristico> destinos) {
    	System.out.println("\nAlta de destino turístico:");

        System.out.println("Países disponibles:");
        for (Pais pais : paises) {
            System.out.println(pais.getCodigo() + " - " + pais.getNombre());
        }

        System.out.print("Ingrese el código del país: ");
        int codigoPais = scanner.nextInt();
        scanner.nextLine(); 

        Pais paisSeleccionado = null;
        for (Pais pais : paises) {
            if (pais.getCodigo() == codigoPais) {
                paisSeleccionado = pais;
                break;
            }
        }

        if (paisSeleccionado == null) {
            System.out.println("Error: Código de país no válido.");
            return;
        }

        System.out.print("Ingrese el código del destino turístico: ");
        int codigoDestino = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ingrese el nombre del destino turístico: ");
        String nombreDestino = scanner.nextLine();

        System.out.print("Ingrese el precio del destino turístico: ");
        double precioDestino = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Ingrese la cantidad de días del destino turístico: ");
        int diasDestino = scanner.nextInt();
        scanner.nextLine(); 

        DestinoTuristico nuevoDestino = new DestinoTuristico(codigoDestino, nombreDestino, precioDestino, paisSeleccionado, diasDestino);
        destinos.add(nuevoDestino);

        System.out.println("Destino turístico agregado correctamente.");
    }
    

    private static void mostrarDestinosTuristicos(ArrayList<DestinoTuristico> destinos) {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
            return;
        }

        System.out.println("Lista de destinos turísticos:");
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino);
        }
    }

    private static void modificarPaisDestinoTuristico(Scanner scanner, ArrayList<Pais> paises, ArrayList<DestinoTuristico> destinos) {
    	if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para modificar.");
            return;
        }

        System.out.println("\nModificar país de un destino turístico:");

        System.out.println("Destinos turísticos disponibles:");
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino.getCodigo() + " - " + destino.getNombre());
        }

        System.out.print("Ingrese el código del destino turístico a modificar: ");
        int codigoDestino = scanner.nextInt();
        scanner.nextLine(); 

        DestinoTuristico destinoSeleccionado = null;
        for (DestinoTuristico destino : destinos) {
            if (destino.getCodigo() == codigoDestino) {
                destinoSeleccionado = destino;
                break;
            }
        }

        if (destinoSeleccionado == null) {
            System.out.println("Error: Código de destino turístico no válido.");
            return;
        }

        System.out.println("Países disponibles:");
        for (Pais pais : paises) {
            System.out.println(pais.getCodigo() + " - " + pais.getNombre());
        }

        System.out.print("Ingrese el nuevo código del país: ");
        int nuevoCodigoPais = scanner.nextInt();
        scanner.nextLine();
       
        Pais nuevoPais = null;
        for (Pais pais : paises) {
            if (pais.getCodigo() == nuevoCodigoPais) {
                nuevoPais = pais;
                break;
            }
        }

        if (nuevoPais == null) {
            System.out.println("Error: Código de país no válido.");
            return;
        }

        destinoSeleccionado.setPais(nuevoPais);
        System.out.println("País del destino turístico modificado correctamente.");
    }

    private static void mostrarDestinosOrdenados(ArrayList<DestinoTuristico> destinos) {
    	if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
            return;
        }

        Collections.sort(destinos, new Comparator<DestinoTuristico>() {
            @Override
            public int compare(DestinoTuristico d1, DestinoTuristico d2) {
                return d1.getNombre().compareToIgnoreCase(d2.getNombre());
            }
        });

        System.out.println("Destinos turísticos ordenados por nombre:");
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino);
        }
    }

    private static void mostrarTodosPaises(ArrayList<Pais> paises) {
    	if (paises.isEmpty()) {
            System.out.println("No hay países para mostrar.");
            return;
        }

        System.out.println("\nLista de países:");
        for (Pais pais : paises) {
            System.out.println(pais.getCodigo() + " - " + pais.getNombre());
        }
    }

    private static void mostrarDestinosPorPais(Scanner scanner, ArrayList<DestinoTuristico> destinos) {
    	if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
            return;
        }

        System.out.print("Ingrese el código del país para mostrar los destinos turísticos asociados: ");
        int codigoPais = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Destinos turísticos asociados al país:");
        boolean encontrado = false;
        for (DestinoTuristico destino : destinos) {
            if (destino.getPais().getCodigo() == codigoPais) {
                System.out.println(destino);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron destinos turísticos asociados al país con el código ingresado.");
        }
    }

    private static void eliminarDestinoTuristico(Scanner scanner, ArrayList<DestinoTuristico> destinos) {
    	if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para eliminar.");
            return;
        }
    	System.out.println("Destinos turísticos disponibles:");
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino.getCodigo() + " - " + destino.getNombre());
        }

        System.out.print("Ingrese el código del destino turístico a eliminar: ");
        int codigoDestino = scanner.nextInt();
        scanner.nextLine(); 

        Iterator<DestinoTuristico> iterator = destinos.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            DestinoTuristico destino = iterator.next();
            if (destino.getCodigo() == codigoDestino) {
                iterator.remove();
                System.out.println("Destino turístico eliminado correctamente.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún destino turístico con el código ingresado.");
        }
    }
}

