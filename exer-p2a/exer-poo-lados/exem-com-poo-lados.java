package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		// Criar duas variáveis de referencia a classe Triangle.
		Triangle x, y;
		x = new Triangle(); // Criação de um objeto.
		y = new Triangle(); // Criação de um objeto.

		System.out.println("Enter the measure of triangle x: ");
		x.A = input.nextDouble();
		x.B = input.nextDouble();
		x.C = input.nextDouble();

		System.out.println("Enter the measure of triangle y: ");
		y.A = input.nextDouble();
		y.B = input.nextDouble();
		y.C = input.nextDouble();

		double areax = x.area();
		double areay = y.area();

		System.out.printf("Triangle X area: %.4f%n", areax);
		System.out.printf("Triangle Y area: %.4f%n", areay);

		if (areax > areay) {
			System.out.println("Larger area: X");
		} else {
			System.out.printf("Larger area: Y ");
		}
		input.close();

	}

}
