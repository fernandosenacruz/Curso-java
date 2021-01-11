package Aula124;

public class Exercicio {

	public static void main(String[] args) {
		//Aula 125 de Upcasting e downcasting
		
		Account acc = new Account(1001, "Ximira", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Ozob", 0.0, 500.0);
		
		// Upcasting
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bliy", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Sean Anthony", 0.0, 0.01);
		
		//Downcasting
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		//BusinessAccount acc5 = (BusinessAccount) acc3; exceção pois não é possivel a conversão.
		if(acc3 instanceof BusinessAccount){
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan.");
		}
		if(acc3 instanceof SavingsAccount){
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}

}
