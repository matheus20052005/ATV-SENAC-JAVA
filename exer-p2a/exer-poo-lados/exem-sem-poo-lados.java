package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the measure of triangle x: ");
		double xA = input.nextDouble();
		double xB = input.nextDouble();
		double xC = input.nextDouble();

		System.out.println("Enter the measure of triangle y: ");
		double yA = input.nextDouble();
		double yB = input.nextDouble();
		double yC = input.nextDouble();

		double p = (xA + xB + xC) / 2.0;
		double areax = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areay = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Triangle X area: %.4f%n ", areax);
		System.out.printf("Triangle Y area: %.4f%n ", areay);

		if (areax > areay) {
			System.out.println("Larger area: X");
		} else {
			System.out.printf("Larger area: Y ");
		}
		input.close();

	}

}
