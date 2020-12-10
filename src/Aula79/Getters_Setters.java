package Aula79;

import java.util.Locale;
import java.util.Scanner;

import Aula79.Product;

public class Getters_Setters {public static void main(String[] args) {
	// Aula se propõe a gerar automaticamente getters and setters ao codigo da aula 75

	Locale.setDefault(Locale.US);
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter product data: ");
	System.out.print("Name: ");
	String name=sc.nextLine();
	System.out.print("Price: ");
	double price=sc.nextDouble();
	
	
	Product product=new Product(name, price);
	
	product.setName("Computer");
	System.out.println("Updated name: "+product.getName());
	product.setPrice(1200.0);
	System.out.println("Updated price: "+product.getPrice());
	
	System.out.println();
	System.out.println("Product data: "+product);
	
	System.out.println();
	System.out.println("Enter the number of product to be added in stock: ");
	int quantity = sc.nextInt();
	product.addProducts(quantity);
	
	System.out.println();
	System.out.println("Updadted data: "+product);
	
	System.out.println();
	System.out.println("Enter the number of product to be removed from stock: ");
	quantity=sc.nextInt();
	product.removeProducts(quantity);
	
	System.out.println();
	System.out.println("Updadted data: "+product);
	
	sc.close();

}

}
