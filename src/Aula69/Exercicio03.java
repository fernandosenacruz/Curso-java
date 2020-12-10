package Aula69;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Aluno aluno=new Aluno();
		System.out.print("Name: ");
		aluno.nome=sc.nextLine();
		System.out.print("Nota 01: ");
		aluno.nota1=sc.nextDouble();
		System.out.print("Nota 02: ");
		aluno.nota2=sc.nextDouble();
		System.out.print("Nota 03: ");
		aluno.nota3=sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", aluno.mediaFinal());
		if (aluno.mediaFinal()< 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", aluno.pass());
		}
		else {
		System.out.println("PASS");
		}
		sc.close();

	}

}
