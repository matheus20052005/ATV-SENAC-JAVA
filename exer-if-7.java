import java.util.Locale;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner input = new Scanner(System.in);
	    
	    double x, y;
	    
	    System.out.printf("Digite o valor X: ");
	    x = input.nextDouble();
	    System.out.printf("Digite o valor Y: ");
	    y = input.nextDouble();
	    
	    
	    if (x == 0 & y == 0) {
	    	System.out.printf("ORIGEM");
	    }
	    else if (x == 0){
	    	System.out.printf("Eixo x");
	    } 
	    else if (y == 0){
	    	System.out.printf("Eixo y");
	    }
	    else if (y > 0 & x > 0){
	    	System.out.printf("Q1");
	    }
	    else if (y > 0 & x < 0){
	    	System.out.printf("Q2");
	    }
	    else if (y < 0 & x < 0){
	    	System.out.printf("Q3");
	    }
	    else if (y < 0 & x > 0){
	    	System.out.printf("Q4");
	    }	    	  
	    input.close();	    
	}
}