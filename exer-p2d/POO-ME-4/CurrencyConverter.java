package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;

	public static double dollarToReal(double amount, double dolarPrice) {
		return amount * dolarPrice * (1.0 + IOF);
	}

}
