package Aula48;

import java.util.Scanner;

public class exercicioWhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valore de x e y: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		while(x!=0&&y!=0){
			
			if(x>0&&y>0){
				System.out.println("Primeiro");
			}else if(x<0&&y>0){
				System.out.println("Segundo");
			}else if(x<0&&y<0){
				System.out.println("Terceiro");
			}else {
				System.out.println("Quarto");
			}
			x=sc.nextInt();
			y=sc.nextInt();
		}
		
		
		sc.close();
	}

}
