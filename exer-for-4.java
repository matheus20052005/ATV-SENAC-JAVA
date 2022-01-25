import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		double res, n1, n2;
		for (int i = 0; i < x; i++) {
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		
		if(n1 <= 0 && n2 <= 0) {
			System.out.println("divisão inposivel");
		}else {
			res = ((n1) / (n2));
			System.out.println(res);
		}	
		}
		input.close();
	}
}
