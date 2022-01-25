import java.util.Locale;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner input = new Scanner(System.in);
	    
	    int A, B;
	    
	    System.out.printf("Digite o numero 1: ");
	    A = input.nextInt();
	    System.out.printf("Digite o numero 2: ");
	    B = input.nextInt();
	    
	    if (A % B  == 0 || B % A == 0) {
	    	System.out.printf("SÃO MULTIPLOS");
	    }
	    else {
	    	System.out.printf("NÃO SÃO MULTIPLOS");	
	    } 
	    input.close();
	}
}