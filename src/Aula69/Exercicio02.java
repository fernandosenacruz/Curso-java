package Aula69;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.print("Name: ");
		funcionario.name=sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.grossSalary=sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax=sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+funcionario);
		System.out.println();		
		System.out.print("Which percentage to increase salary? ");
		double percentual=sc.nextDouble();
		funcionario.increaseSalary(percentual);
		System.out.println();
		System.out.println("Updated data: "+funcionario);
		
		sc.close();
	}

}
