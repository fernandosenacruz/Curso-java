package Aula75;

import java.util.Locale;
import java.util.Scanner;

import Aula75.Product;;

public class Construtores {

	public static void main(String[] args) {
		// Aula se propõe a melhorar o codigo da aula 66

			Locale.setDefault(Locale.US);
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			String name=sc.nextLine();
			System.out.print("Price: ");
			double price=sc.nextDouble();
			System.out.print("Quantity in Stock: ");
			int quantity=sc.nextInt();
			
			Product product=new Aula75.Product(name, price, quantity);
			
			System.out.println();
			System.out.println("Product data: "+product);
			
			System.out.println();
			System.out.println("Enter the number of product to be added in stock: ");
			quantity = sc.nextInt();
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
