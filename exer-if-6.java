import java.util.Locale;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner input = new Scanner(System.in);
	    
	    double v1;
	    
	    System.out.printf("Digite o valor: ");
	    v1 = input.nextDouble();
	    
	    if (v1 >= 0 & v1 <= 25) {
	    	System.out.printf("Intervalo [0,25]");
	    }
	    else if (v1 >= 25 & v1 <= 50){
	    	System.out.printf("Intervalo [25,50]");
	    } 
	    else if (v1 >= 50 & v1 <= 75){
	    	System.out.printf("Intervalo [50,75]");
	    }
	    else if (v1 >= 75 & v1 <= 100){
	    	System.out.printf("Intervalo [75,100]");
	    }
	    else {
	    	System.out.printf("Fora de intervalo");
	    }
	   input.close(); 	    
	}
}