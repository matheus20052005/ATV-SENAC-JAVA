import java.util.Locale;
import java.util.Scanner;

public class Principal
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner input = new Scanner(System.in);
	    
	    double codigo, quantidade, preco, total;
	    
	    System.out.printf("Digite o codigo: ");
	    codigo = input.nextDouble();
	    System.out.printf("Digite a quantidade: ");
	    quantidade = input.nextDouble();
	    
	    if (codigo == 1) {
	    	preco = 4.00;
	    	total = preco * quantidade;
	    	System.out.printf("Total: R$ %.2f", total);
	    }
	    else if (codigo == 2){
	    	preco = 4.50;
	    	total = preco * quantidade;
	    	System.out.printf("Total: R$ %.2f", total);
	    } 
	    else if (codigo == 3){
	    	preco = 5.00;
	    	total = preco * quantidade;
	    	System.out.printf("Total: R$ %.2f", total);
	    }
	    else if (codigo == 4){
	    	preco = 2.00;
	    	total = preco * quantidade;
	    	System.out.printf("Total: R$ %.2f", total);
	    }
	    else if (codigo == 5){
	    	preco = 1.50;
	    	total = preco * quantidade;
	    	System.out.printf("Total: R$ %.2f", total);
	    }
	    else {
	    	System.out.printf("CODIGO INVALIDO");
	    }
	    input.close();    
	}
}