import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int fat = 1;
		int n1 = input.nextInt();

		for (int i = 1; i <= n1; i++) {
			fat = fat * i;

		}
		System.out.println(fat);
		input.close();
	}
}