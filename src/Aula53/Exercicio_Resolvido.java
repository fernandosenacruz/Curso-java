package Aula53;

import java.util.Scanner;

public class Exercicio_Resolvido {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++){
			int tabuada=i*n;
			System.out.println(i+" x "+n+" = "+tabuada);
		}
		
		sc.close();
	}

}
