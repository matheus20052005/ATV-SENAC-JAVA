package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		System.out.println("Nome:");
		funcionario.name = input.nextLine();
		System.out.println("Salário bruto:");
		funcionario.salarioBruto = input.nextDouble();
		System.out.println("Imposto:");
		funcionario.imposto = input.nextDouble();

		System.out.println();
		System.out.println("Funcionario: " + funcionario.ToString());
		System.out.println();
		System.out.println("Digite a porcentagem para aumentar o salário: ");
		double porcentagem = input.nextDouble();
		funcionario.aumentarSalario(porcentagem);
		System.out.println("Dados atualizados: " + funcionario.ToString());

		input.close();
	}

}
