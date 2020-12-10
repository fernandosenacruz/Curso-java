package Aula53;

import java.util.Scanner;

public class Exercicio_For05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int fatorial=1;
		
		for(int i=1;i<=n;i++){
			fatorial=fatorial*i;
		}
		
		System.out.println(fatorial);
		
		sc.close();
	}

}
