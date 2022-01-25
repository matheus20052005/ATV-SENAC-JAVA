import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner input = new Scanner(System.in);
	    
	    double r1, vf;
	    
	    System.out.printf("Digite sua renda: ");
	    r1 = input.nextDouble();
	    
	    if (r1 >= 0.00 & r1 <= 2000.00) {
	    	System.out.printf("Isento");
	    }
	    else if (r1 >= 2000.01 & r1 <= 3000.00){
	    	vf = (r1 - 2000) * 0.8;
	    	System.out.printf("R$ %.2f",  vf);
	    } 
	    else if (r1 >= 3000.01 & r1 <= 4500.00){
	    	vf = (r1 - 3000) * 0.18 + 1000.0 * 0.08 ;
	    	System.out.printf("R$ %.2f",  vf);
	    } 
	    else {
	    	vf = (r1 - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08 ;
	    	System.out.printf("R$ %.2f", vf);
	    }
	    input.close();	    
	}
}