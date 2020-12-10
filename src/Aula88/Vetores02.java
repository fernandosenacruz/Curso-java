package Aula88;

import java.util.Locale;
import java.util.Scanner;

public class Vetores02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		Product[] vetor02= new Product[n];
		
		for(int i=0;i<vetor02.length;i++){
			sc.nextLine();
			String name=sc.nextLine();
			double price=sc.nextDouble(); 
			vetor02[i]=new Product(name,price);
		}
		
		double sum=0.0;
		for(int i=0;i<vetor02.length;i++){
			sum+=vetor02[i].getPrice();
		}
		double average=sum/vetor02.length;
		
		System.out.printf("Average price: $%.2f\n", average);
		
		sc.close();
	}

}
