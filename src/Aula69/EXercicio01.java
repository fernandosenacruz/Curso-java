package Aula69;

import java.util.Locale;
import java.util.Scanner;

public class EXercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Retangulo retangulo = new Retangulo();
		System.out.print("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();

		System.out.printf("Area = %.2f\n", retangulo.area());
		System.out.printf("Perimeter = %.2f%n",retangulo.perimeter());
		System.out.printf("Diagonal = %.2f\n", retangulo.diagonal());

		sc.close();

	}

}
