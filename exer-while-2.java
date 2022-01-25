import java.util.Locale;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
	    int x = input.nextInt();
	    int y = input.nextInt();
	 
		while ((x  != 0) && (y != 0)) {
		    if (y > 0 & x > 0){
		    	System.out.println("primeiro");
		    }
		    else if (y > 0 & x < 0){
		    	System.out.println("segundo");
		    }
		    else if (y < 0 & x < 0){
		    	System.out.println("terceiro");
		    }
		    else if (y < 0 & x > 0){
		    	System.out.println("quarto");
		    }
	    x = input.nextInt();
	    y = input.nextInt();
	    
		}
		input.close();    
	}
}