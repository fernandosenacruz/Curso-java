package Aula81;

import java.util.Locale;
import java.util.Scanner;

public class Conta_Bancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Correntista correntista;
		
		System.out.print("Enter accound number: ");
		int account=sc.nextInt();		
		System.out.print("Enter accound holder: ");
		sc.nextLine();
		String holder=sc.nextLine();		
		System.out.print("Is there an inicial deposit (y/n)?");
		char resposta=sc.next().charAt(0);
		if (resposta=='y'){
			System.out.print("Enter inicial deposit value: ");
			double inicialDeposit=sc.nextDouble();
			correntista = new Correntista(account, holder, inicialDeposit);
		}else{
			correntista = new Correntista(account, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(correntista);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue=sc.nextDouble();
		correntista.doDeposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(correntista);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue=sc.nextDouble();
		correntista.doWithdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(correntista);
		
		
		sc.close();
	}

}
