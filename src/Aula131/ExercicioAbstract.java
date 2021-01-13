package Aula131;

import java.util.ArrayList;
import java.util.List;

public class ExercicioAbstract {

	public static void main(String[] args) {
		// Exercício usando a superclasse Account como abstract
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Ximira", 1000.0, 0.01));
		list.add(new BusinessAccount(1002, "Bily", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Asdrubal", 900.0, 0.01));
		list.add(new BusinessAccount(1002, "Ozob", 1500.0, 500.0));
				
		// Depósitar 10.0 em cada conta e contabilizar o novo saldo
		for(Account acc : list){
			acc.deposit(10.0);
			System.out.printf("Updated balance for account %d: $ %.2f\n", acc.getNumber(), acc.getBalance());
		}
		
		double sum = 0.0;
		for(Account acc : list){
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: $ %.2f\n",sum);		
	}

}
