package entities;

public class ImportedProducts extends Product{

	private double customsFee;

	public ImportedProducts(String name, Double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsfee() {
		return customsFee;
	}

	public void setCustomfee(double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName()
				+ " $ "
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ "
				+ String.format("%.2f", customsFee)
				+ ")";
	}
}
