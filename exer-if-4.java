import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner input = new Scanner(System.in);
	    
	    int hi, hf, ht;
	    
	    System.out.printf("Digite a hora de inicio: ");
	    hi = input.nextInt();
	    System.out.printf("Digite a hora final: ");
	    hf = input.nextInt();
	    
	    if (hi > hf) {
	    	ht = hf - hi;
	    }
	    else if (hf > hi){
	    	ht = 24 - (hi - hf);	
	    } 
	    else {
	    	ht = 24;
	    }
	    System.out.printf("O JOGO DUROU " + ht + " HORA(S)");
	    input.close();
	}
}