package Aula17;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá Mundo!");
		
		int y=32;
		System.out.println(y);
		
		String nome="Ximira";
		int idade=45;
		double renda=9889.00;
		System.out.printf("%s, %d anos, tem renda de R$ %.2f.\n", nome, idade, renda);
		
		double x=10.457854;
		System.out.printf("%.2f\n", x); // printf imprime formatado
		Locale.setDefault(Locale.US); // importa o padrão de separador de vírgula com .
		System.out.printf("%.5f\n", x);
		System.out.printf("Resultado= %2f m/s.\n",x); //impressão formatada com elementos concatenados
		
		

	}

}