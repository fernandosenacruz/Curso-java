package Aula53;

import java.util.Scanner;

public class Exercicio_For04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			double divisao= (double)a/b;
			if(b==0){
				System.out.println("Divisão impossível");
			}else{
				System.out.println(divisao);
			}
		}
		
		
		sc.close();

	}

}
