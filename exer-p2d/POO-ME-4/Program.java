package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolarPrice = input.nextDouble();
		System.out.print("How many dolar will be bought?  ");
		double amount = input.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(amount, dolarPrice);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		input.close();
	}

}
