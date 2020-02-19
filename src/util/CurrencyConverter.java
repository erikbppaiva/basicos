package util;

public class CurrencyConverter {

	public static double quant;
	public static double cotacao;

	public static double valorDolar() {
		return quant * cotacao;
	}

	public static double iof() {
		return (valorDolar()) * 0.06 + valorDolar();

	}

}
