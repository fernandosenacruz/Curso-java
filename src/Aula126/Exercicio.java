package Aula126;

import Aula124.Account;
import Aula124.BusinessAccount;
import Aula124.SavingsAccount;

public class Exercicio {

	public static void main(String[] args) {
		// Sobreposição, Super() e anotação @Override
		
		Account acc1 = new Account(1001,"Ximira", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002,"Bily",1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Ozob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());

	}

}
