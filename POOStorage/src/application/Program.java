package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProducts;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat data = new SimpleDateFormat("dd/mm/yyyy");

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int num = input.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Product # " + i + " data: ");
			System.out.print("Common, used or importd (c/u/i)? ");
			char type = input.next().charAt(0);
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("price: : ");
			double price = input.nextDouble();

			if (type == 'c' || type == 'C') {
				list.add(new Product(name, price));
			} else if (type == 'u' || type == 'U') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = data.parse(input.next());
				list.add(new UsedProduct(name, price, date));
			} else {
				System.out.print("Customs fee: ");
				Double customsFee = input.nextDouble();
				list.add(new ImportedProducts(name, price, customsFee));

			}
		}
		System.out.println();
		System.out.println("PRICE TAGS: ");

		for (Product pro : list) {
			System.out.println(pro.priceTag());

		}

		input.close();
	}

}
