package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Notas notas = new Notas();

		System.out.printf("Nome do aluno:");
		notas.name = input.nextLine();
		System.out.println("Digite as três notas do aluno:");
		notas.nota1 = input.nextDouble();
		notas.nota2 = input.nextDouble();
		notas.nota3 = input.nextDouble();

		if (notas.notaFinal() >= 60.00) {
			System.out.println("NOTA FINAL = " + notas.notaFinal());
			System.out.println("APROVADO");

		} else if (notas.notaFinal() < 60.00) {
			System.out.println("NOTA FINAL = " + notas.notaFinal());
			System.out.println("REPROVADO");
			System.out.printf("FALTARAM " + (60.00 - notas.notaFinal()) + " PONTOS");
		}
	}

}
