package entities;

public class Funcionario {
	public String name;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public void aumentarSalario(double porcentagem) {
		this.salarioBruto += salarioBruto / 100 * porcentagem;
	}

}
