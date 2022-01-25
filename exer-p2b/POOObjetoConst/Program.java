package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		/*
		 * System.out.println("Enter product data: "); System.out.printf("Name: ");
		 * String name = input.nextLine(); System.out.printf("Price: "); double price =
		 * input.nextDouble(); System.out.printf("Quantity in stock: "); int quantity =
		 * input.nextInt();
		 */

		Product prod = new Product("TV", 900.0, 10);
		//Product prod = new Product(name, price, quantity);

		System.out.println();
		System.out.printf("product data: " + prod.ToString());

		System.out.println();
		System.out.printf("Enter the number of products to be added in stock: ");
		int quantity = input.nextInt();
		prod.addProducts(quantity);

		System.out.println();
		System.out.printf("Update data: " + prod.ToString());

		System.out.println();
		System.out.printf("Enter the number of products to be removed from stock: ");
		quantity = input.nextInt();
		prod.removeProducts(quantity);

		System.out.println();
		System.out.printf("Update data: " + prod.ToString());

	}

}
