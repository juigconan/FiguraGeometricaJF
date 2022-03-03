package FiguraG;

import java.util.Scanner;

public class Figura {
	private static Scanner teclado;

	public static void main(String[] args) {
		/*
		 * Queremos averiguar si la figura introducida es un cuadrado o un rectángulo y
		 * mostrar su perímetro.
		 */
		int b, a;
		String f;
		teclado = new Scanner(System.in);
		System.out.print("Introduce la base de la figura: ");
		b = teclado.nextInt();
		System.out.print("Introduce la altura de la figura: ");
		a = teclado.nextInt();
		if (b == a) {
			f = "cuadrado";
		} else {
			f = "rectángulo";
		}
		int perimetro = 2 * b + 2 * a;
		System.out.println("La figura es un " + f + " y su perímetro es: " + perimetro);
	}
}