package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public Product() {
		
	}
	// contrutor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double TotalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		// this.quantity = this.quantity + quantity;
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		// this.quantity = this.quantity - quantity;
		this.quantity -= quantity;
	}
	
	
	public String ToString() {
		return name 
			   + ", $ "
			   + String.format("%.2f", price) 
			   + ", "
			   + quantity
			   + " units, Total: $ "
			   + String.format("%.2f", TotalValueInStock());	
	}

}
