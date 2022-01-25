import java.util.Locale;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner input = new Scanner(System.in);
	    
	    int n1;
	    
	    System.out.printf("Digite o numero 1: ");
	    n1 = input.nextInt();
	    
	    if (n1 % 2 == 0 ) {
	    	System.out.printf("PAR");
	    }
	    else {
	    	System.out.printf("IMPAR");    	
	    } 
	    input.close();
	}
}