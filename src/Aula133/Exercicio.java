package Aula133;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de N contribuintes (N fornecido
		 * pelo usuário), os quais podem ser pessoa física ou pessoa jurídica, e
		 * depois mostrar o valor do imposto pago por cada um, bem como o total
		 * de imposto arrecadado. Os dados de pessoa física são: nome, renda
		 * anual e gastos com saúde. Os dados de pessoa jurídica são nome, renda
		 * anual e número de funcionários. As regras para cálculo de imposto são
		 * as seguintes: Pessoa física: pessoas cuja renda foi abaixo de
		 * 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 em
		 * diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
		 * destes gastos são abatidos no imposto. Pessoa jurídica: pessoas
		 * jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de
		 * 10 funcionários, ela paga 14% de imposto.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Taxpayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println("Taxpayer #" + i + " data: ");
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double aI = sc.nextDouble();
			if(ch == 'i'){				
				System.out.print("Health expenditures: ");
				double hE = sc.nextDouble();
				list.add(new Individual(name, aI, hE));
			}else{
				System.out.print("Number of employee: ");
				int noE = sc.nextInt();
				list.add(new Company(name, aI, noE));
			}
		}
		System.out.println();
		System.out.println("Taxes Paid: ");	
		for(Taxpayer tp : list){
			System.out.printf(tp.getName() + ": $ " + String.format("%.2f\n",tp.tax()));
		}
		double sum = 0;
		for(Taxpayer tp : list){
			sum += tp.tax();
		}
		System.out.println();
		System.out.printf("Total taxes: $ " + String.format("%.2f\n", sum));
	
		sc.close();
	}

}
