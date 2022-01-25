package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	private static final double pi = 3.14159;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		
		double circumference = circumference(radius);
		double volume = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circumference);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("PI value: %.2f%n", pi);
		
		input.close();
	}

	private static double volume(double radius) {
		
		return 4.0 * pi * radius * radius * radius / 3.0;
	}

	private static double circumference(double radius) {
		return 2.0 * pi * radius;
	}

}
