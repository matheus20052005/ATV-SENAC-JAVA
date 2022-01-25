package entities;

public class BussinessAccount extends Account {

	public double loanLimit = 5000.0;

	public BussinessAccount(int number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (loanLimit >= amount) {
			System.out.println("AOPROVE LOAN! ");

		} else {
			System.out.println("APPROVE NOT LOAN! ");
		}
	}

}
