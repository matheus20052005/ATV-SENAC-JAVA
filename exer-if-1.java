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
	    
	    if (n1 > 0 ) {
	    	System.out.printf("NÃO NEGATIVO");
	    }
	    else {
	    	System.out.printf("NEGATIVO"); 	
	    } 
	    input.close();
	}
}
