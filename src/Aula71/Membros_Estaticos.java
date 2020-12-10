package Aula71;

import java.util.Locale;
import java.util.Scanner;

public class Membros_Estaticos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double circunference= Calculator.circunference(radius);
		double volume = Calculator.volume(radius);
		
		System.out.printf("Circunference: %.2f\n",circunference);
		System.out.printf("Volume: %.2f\n",volume);
		System.out.print("PI value: "+Math.PI);
		
		
		sc.close();
	}

}
