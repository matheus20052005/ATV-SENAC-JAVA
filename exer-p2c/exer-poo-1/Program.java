package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Retangulo retangulo = new Retangulo(); 

		System.out.println("Entre a largura e altuira do Retângulo: ");
		retangulo.Largura = input.nextDouble();
		retangulo.Altura = input.nextDouble();
		

		System.out.println();
		System.out.println("AREA = " + retangulo.area());
		System.out.println("PERÍMETRO = " + retangulo.perimetro());
		System.out.println("DIAGONAL = " + retangulo.diagonal());

		
	}

}
