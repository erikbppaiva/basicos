package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;



public class Conversao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o preço do dolar: ");
		CurrencyConverter.cotacao = sc.nextDouble();

		System.out.print("Quantos dolars você vai comprar? ");
		CurrencyConverter.quant = sc.nextInt();
		
		
		System.out.printf("Amount to be in reais = %.2f%n", CurrencyConverter.iof());
	

	}

}
