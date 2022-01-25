package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BussinessAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Account account = new Account(3542, "Matheus Lippert", 3000.0);
		BussinessAccount ba = new BussinessAccount(3542, "vitor Lippert", 1000.0, 5000.0);
		
		System.out.println("Account: " + account);
		
		System.out.println();
		
		System.out.println("BA: " +  ba);
		
		ba.loan(5000.0);
		
		input.close();

	}

}
