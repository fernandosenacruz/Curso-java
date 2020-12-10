package Aula53;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_For03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			double valor1=sc.nextDouble();
			double valor2=sc.nextDouble();
			double valor3=sc.nextDouble();
			
			double mp=(valor1*2.0+valor2*3.0+valor3*5.0)/10.0;
			
			System.out.printf("%.1f\n", mp);
		}
		
		sc.close();
	}

}
