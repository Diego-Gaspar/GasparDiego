package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	
	//constantes pedidas
	
	private static final double salario_minimo = 210000.00;
    private static final double aumento_por_merito = 20000.00;
    
    private String nombre;
    private int legajo;
    private double salario;
    
    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
    
        //asignación del salario
        if (salario >= salario_minimo) {
            this.salario = salario;
        } else {
            this.salario = salario_minimo;
        }
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.printf("Salario $: %.2f\n", salario);
    }
    
    public void darAumento() {
        salario += aumento_por_merito;
    }
}
