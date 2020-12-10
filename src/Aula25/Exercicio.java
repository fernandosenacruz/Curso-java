package Aula25;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		System.out.println("Digite o nome do(a) auluno(a), nota01 e nota02 separados por espaços: ");
		Scanner sc = new Scanner(System.in);

		String x;
		double nota01, nota02, media;
		x = sc.next();
		nota01 = sc.nextDouble();
		nota02 = sc.nextDouble();
		media = (nota01 + nota02) / 2;

		System.out.printf(x + " obteve média de %.3f\n", media);

		sc.close();
	}

}
