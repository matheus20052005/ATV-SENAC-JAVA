package entities;

public class Notas {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double pontos() {
		if (notaFinal() < 60.00) {
			return 60.00 - notaFinal();
		} else {
			return 0.00;
		}
	}
		
		public void aproRepro() {
			if (notaFinal() < 60.00) {
				System.out.println("REPROVADO");
				System.out.printf("FALTARAM %.2f PONTOS", pontos());

			} else {
				System.out.println("APROVADO");
				
			}
		}
}
