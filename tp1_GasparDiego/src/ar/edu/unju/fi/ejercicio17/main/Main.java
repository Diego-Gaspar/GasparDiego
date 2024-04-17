package ar.edu.unju.fi.ejercicio17.main;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Mostrar los datos del jugador");
            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores");
            System.out.println("7 - Mostrar la cantidad de jugadores de una nacionalidad");
            System.out.println("8 - Salir");
            System.out.print("Ingrese su opción: ");
            
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (opcion) {
                    case 1:
                        altaJugador(scanner, jugadores);
                        break;
                    case 2:
                        mostrarDatosJugador(scanner, jugadores);
                        break;
                    case 3:
                        mostrarJugadoresOrdenados(jugadores);
                        break;
                    case 4:
                        modificarJugador(scanner, jugadores);
                        break;
                    case 5:
                        eliminarJugador(scanner, jugadores);
                        break;
                    case 6:
                        mostrarCantidadTotalJugadores(jugadores);
                        break;
                    case 7:
                        mostrarCantidadPorNacionalidad(scanner, jugadores);
                        break;
                    case 8:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 8.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.nextLine(); 
                opcion = 0; 
            }
        } while (opcion != 8);

        scanner.close();
    }

    private static void altaJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        try {
            System.out.println("Ingrese los datos del jugador:");
    
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
    
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
    
            System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
            LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
    
            System.out.print("Nacionalidad: ");
            String nacionalidad = scanner.nextLine();
    
            System.out.print("Estatura: ");
            double estatura = scanner.nextDouble();
    
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            
            scanner.nextLine(); 
            
            System.out.print("Posición (delantero, medio, defensa, arquero): ");
            String posicion = scanner.nextLine();
    
            Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
            jugadores.add(jugador);
    
            System.out.println("Jugador agregado con éxito.");
        } catch (Exception e) {
            System.out.println("Error al ingresar los datos del jugador. Por favor, asegúrese de ingresar los datos correctamente.");
        }
    }

    private static void mostrarDatosJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        try {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = scanner.nextLine();
    
            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = scanner.nextLine();
    
            boolean encontrado = false;
            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                    System.out.println("Datos del jugador:");
                    System.out.println(jugador);
                    encontrado = true;
                    break;
                }
            }
    
            if (!encontrado) {
                System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
            }
        } catch (Exception e) {
            System.out.println("Error al buscar los datos del jugador. Por favor, asegúrese de ingresar los datos correctamente.");
        }
    }

    private static void mostrarJugadoresOrdenados(ArrayList<Jugador> jugadores) {
        try {
            if (jugadores.isEmpty()) {
                System.out.println("No hay jugadores para mostrar.");
            } else {
                
                Collections.sort(jugadores, (j1, j2) -> j1.getApellido().compareToIgnoreCase(j2.getApellido()));
    
                System.out.println("Jugadores ordenados por apellido:");
                for (Jugador jugador : jugadores) {
                    System.out.println(jugador);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar los jugadores ordenados. Por favor, asegúrese de ingresar los datos correctamente.");
        }
    }

    private static void modificarJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        try {
            System.out.print("Ingrese el nombre del jugador que desea modificar: ");
            String nombre = scanner.nextLine();
    
            System.out.print("Ingrese el apellido del jugador que desea modificar: ");
            String apellido = scanner.nextLine();
    
            boolean encontrado = false;
            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                    System.out.println("Ingrese los nuevos datos del jugador:");
    
                    System.out.print("Nuevo nombre: ");
                    jugador.setNombre(scanner.nextLine());
    
                    System.out.print("Nuevo apellido: ");
                    jugador.setApellido(scanner.nextLine());
    
                    System.out.print("Nueva fecha de nacimiento (YYYY-MM-DD): ");
                    jugador.setFechaNacimiento(LocalDate.parse(scanner.nextLine()));
    
                    System.out.print("Nueva nacionalidad: ");
                    jugador.setNacionalidad(scanner.nextLine());
    
                    System.out.print("Nueva estatura: ");
                    jugador.setEstatura(scanner.nextDouble());
    
                    System.out.print("Nuevo peso: ");
                    jugador.setPeso(scanner.nextDouble());
                    
                    scanner.nextLine(); 
                    
                    System.out.print("Nueva posición (delantero, medio, defensa, arquero): ");
                    jugador.setPosicion(scanner.nextLine());
    
                    System.out.println("Datos del jugador modificados con éxito.");
                    encontrado = true;
                    break;
                }
            }
    
            if (!encontrado) {
                System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
            }
        } catch (Exception e) {
            System.out.println("Error al modificar los datos del jugador. Por favor, asegúrese de ingresar los datos correctamente.");
        }
    }

    private static void eliminarJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        try {
            System.out.print("Ingrese el nombre del jugador que desea eliminar: ");
            String nombre = scanner.nextLine();
    
            System.out.print("Ingrese el apellido del jugador que desea eliminar: ");
            String apellido = scanner.nextLine();
    
            Iterator<Jugador> iterador = jugadores.iterator();
            boolean encontrado = false;
            while (iterador.hasNext()) {
                Jugador jugador = iterador.next();
                if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                    iterador.remove();
                    System.out.println("Jugador eliminado con éxito.");
                    encontrado = true;
                    break;
                }
            }
    
            if (!encontrado) {
                System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar el jugador. Por favor, asegúrese de ingresar los datos correctamente.");
        }
    }

    private static void mostrarCantidadTotalJugadores(ArrayList<Jugador> jugadores) {
        try {
            System.out.println("Cantidad total de jugadores: " + jugadores.size());
        } catch (Exception e) {
            System.out.println("Error al mostrar la cantidad total de jugadores. Por favor, asegúrese de ingresar los datos correctamente.");
        }
    }

    private static void mostrarCantidadPorNacionalidad(Scanner scanner, ArrayList<Jugador> jugadores) {
        try {
            System.out.print("Ingrese la nacionalidad para contar jugadores: ");
            String nacionalidad = scanner.nextLine();
    
            int contador = 0;
            for (Jugador jugador : jugadores) {
                if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                    contador++;
                }
            }
    
            System.out.println("Cantidad de jugadores de la nacionalidad " + nacionalidad + ": " + contador);
        } catch (Exception e) {
            System.out.println("Error al mostrar la cantidad de jugadores por nacionalidad. Por favor, asegúrese de ingresar los datos correctamente.");
        }
    }
}
