package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Notas notas = new Notas();

		System.out.println("Nome do aluno:");
		notas.name = input.nextLine();
		System.out.println("Digite as três notas do aluno:");
		notas.nota1 = input.nextDouble();
		notas.nota2 = input.nextDouble();
		notas.nota3 = input.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f%n", notas.notaFinal());
		
		notas.aproRepro();
		
		input.close();
	
	}

}
