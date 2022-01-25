package entities;

public class Retangulo {
	
	public double Largura;
	public double Altura;
	
	public double area() {
		return Altura * Largura;
	}
	public double perimetro() {
		return ((Largura * 2) + (Altura * 2));
	}
	public double diagonal() {
		
		return Math.sqrt((Largura * Largura) + (Altura * Altura) );
	}
	
	

}
