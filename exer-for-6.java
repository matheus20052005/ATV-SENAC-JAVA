import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
	
		int n1;
		n1 = input.nextInt();
		for(int i = 1; i <= n1; i++) {
        	if (n1 % i == 0) 
        		System.out.println(i);   
        }
		input.close();
		}
		
	}



