package Aula138;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// Exemplos de exceções tratadas em bloco try catch + pilhas de chamadas
		// de métodos

		method2();

		System.out.println("End");
	}

	public static void method() {
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
			e.printStackTrace();
		}
		System.out.println("Ending method");
		sc.close();
	}

	public static void method2() {
		System.out.println("Call method");
		method();
		System.out.println("Ending method2");
	}
}
