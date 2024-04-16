package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private double precio;
	private double area;
	private boolean ingredientesEspeciales;
	
	private static final double adicional_20 = 500;
	private static final double adicional_30 = 750;
	private static final double adicional_40 = 1000;
	
	public Pizza() {}
	
	public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }
    
    
    public void calcularPrecio() {
        switch (diametro) {
            case 20:
                if (ingredientesEspeciales) {
                    precio = 4500 + adicional_20;
                } else {
                    precio = 4500;
                }
                break;
            case 30:
                if (ingredientesEspeciales) {
                    precio = 4800 + adicional_30;
                } else {
                    precio = 4800;
                }
                break;
            case 40:
                if (ingredientesEspeciales) {
                    precio = 5500 + adicional_40;
                } else {
                    precio = 5500;
                }
                break;
            default:
                System.out.println("Diametro no válido.");
        }
    }
    public void calcularArea() {
        area = Math.PI * Math.pow(diametro / 2.0, 2);
    }
}
