import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double mp = 0;
		int x = input.nextInt();

		for (int i = 0; i < x; i++) {
			double nota1 = input.nextDouble();
			double nota2 = input.nextDouble();
			double nota3 = input.nextDouble();
			
			mp = ((nota1 * 2.0) + (nota2 * 3.0) + (nota3 * 5.0)) / (2 + 3 + 5);
			System.out.printf("%.1f%n", mp);
		}
		input.close();
	}
}
