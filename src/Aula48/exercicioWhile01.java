package Aula48;

import java.util.Scanner;

public class exercicioWhile01 {

	public static void main(String[] args) {
		System.out.println("Digite a senha: ");
		Scanner sc=new Scanner(System.in);
		int senha=sc.nextInt();
		int senhaCorreta=2002;
		
		while(senha!=senhaCorreta){
			System.out.println("Senha Inválida!");
			System.out.println("Digite a senha: ");
			senha=sc.nextInt();
		}
		System.out.println("Acesso Permitido.");
		
		sc.close();
	}

}
