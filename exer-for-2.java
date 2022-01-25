import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int out = 0;
		int in = 0;
		int x = input.nextInt();

		for (int i = 1; i <= x; i++) {
			int val = input.nextInt();
			if (val >= 10 && val <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println(in + "in");
		System.out.printf(out + "out");
		input.close();
	}
}
