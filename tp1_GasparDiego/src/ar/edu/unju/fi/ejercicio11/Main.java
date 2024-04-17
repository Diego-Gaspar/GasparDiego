package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		int j = 40;
        int i = 2;

        for (; j >= 0; j -= 2, i += 2) {
            System.out.print((i * j) + " ");
        }
	}
}

