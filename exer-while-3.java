import java.util.Locale;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina =  0;
		int diesel = 0;
		int x = input.nextInt();
		
		while (x != 4) {
			
		    if (x == 1){
		    	alcool +=1;
		    }
		    else if (x == 2){
                 gasolina  +=1;
		    }
		    else if (x == 3){
		    	diesel +=1;
		    }
			x = input.nextInt();   
		}
		System.out.printf("MUITO OBRIGADO %n Alcool: %d%n Gasolina: %d%n Diesel: %d%n", alcool, gasolina, diesel  );
		input.close();    
	}
}