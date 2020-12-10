package Aula53;

import java.util.Scanner;

public class Exercicio_For07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		if (n>0){
			for (int i=1;i<=n;i++){
				int um=i;
				int quadrado=i*i;
				int cubo=i*i*i;
				
				System.out.println(um+" "+quadrado+" "+cubo);
			}
		}
		
		sc.close();
	}

}
