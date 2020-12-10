package Aula72;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Fixacao {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price=sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollars=sc.nextDouble();
		
		double real=CurrencyConver.Cambio(dollars, price);		
		
		System.out.printf("Amount to be paid in reais = %.2f\n",real);
		
		sc.close();
	}

}
