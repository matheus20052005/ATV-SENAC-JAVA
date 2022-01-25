import java.util.Locale;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
				
		int x = input.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if(i % 2 == 1) {
			System.out.println(i);
		}	
		input.close();    
	}
}
}