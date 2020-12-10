package Aula53;

import java.util.Scanner;

public class Exercicio_Resolvido02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int nim, max, soma=0;
		if(x<y){
			nim=x;
			max=y;
		}else{
			nim=y;
			max=x;
		}
		
		for(int i=nim+1;i<max;i++){
			if(i%2!=0){
				soma+=i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
