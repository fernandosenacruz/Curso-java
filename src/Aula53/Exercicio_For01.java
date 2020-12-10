package Aula53;

import java.util.Scanner;

public class Exercicio_For01 {
	public static void mai(String[]args){
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		
		for(int i=1;i<=x;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}