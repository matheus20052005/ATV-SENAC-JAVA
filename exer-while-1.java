import java.util.Locale;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int x = 2002;
		
	    int sn = input.nextInt();
		
		while (sn != x) {
			System.out.println("Senha invalida");
			sn = input.nextInt();
		}
		System.out.println("Acesso permitido");
		
		input.close();
	}
}