package Aula48;

import java.util.Scanner;

public class exercicioWhile03 {

	public static void main(String[] args) {
		System.out.println("Digite 1 para Álcool, 2 para Gasolina, 3 para Diesel ou 4 para fim: ");
		Scanner sc=new Scanner(System.in);
		
		int alcool=0,gasolina=0,diesel=0;
		int codigo=sc.nextInt();
		
		while(codigo!=4){
			if(codigo==1){
				alcool+=1;
			}else if(codigo==2){
				gasolina+=1;
			}else if(codigo==3){
				diesel+=1;
			}
			
			codigo=sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
