package Aula77;

import java.util.Locale;
import java.util.Scanner;

import Aula77.Product;

public class Sobrecarga {

	public static void main(String[] args) {
		// Aula se propõe a adicionar uma sobrecarga ao codigo da aula 75

			Locale.setDefault(Locale.US);
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			String name=sc.nextLine();
			System.out.print("Price: ");
			double price=sc.nextDouble();
			
			
			Product product=new Aula77.Product(name, price);
			
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

