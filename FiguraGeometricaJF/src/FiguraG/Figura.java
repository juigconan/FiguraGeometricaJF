package FiguraG;

import java.util.Scanner;

public class Figura {
	private static Scanner teclado;

	public static void main(String[] args) {
		/*
		 * Queremos averiguar si la figura introducida es un cuadrado o un rectángulo y
		 * mostrar su perímetro.
		 */
		int ladob, ladoa;
		String figura;
		teclado = new Scanner(System.in);
		System.out.print("Introduce la base de la figura: ");
		ladob = teclado.nextInt();
		System.out.print("Introduce la altura de la figura: ");
		ladoa = teclado.nextInt();
		figura = tipoFigura(ladob, ladoa);
		int perimetro = 2 * ladob + 2 * ladoa;
		System.out.println("La figura es un " + figura + " y su perímetro es: " + perimetro);
	}

	private static String tipoFigura(int ladob, int ladoa) {
		String figura;
		if (ladob == ladoa) {
			figura = "cuadrado";
		} else {
			figura = "rectángulo";
		}
		return figura;
	}
}