package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();		
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Update name: "+ product.getName());
		product.setPrice(1200);
		System.out.println("Update price: "+ product.getPrice());
		
		System.out.println("Product data: " + product.toSting());
		System.out.println("");
		
		System.out.print("Enter the number of products to added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("update data: " + product.toSting());
		System.out.println("");
		
		System.out.print("Enter the number of products to removed in stock: ");
		quantity= sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.print("remove data: " + product.toSting());
		System.out.println("");

		sc.close();

	}

}
