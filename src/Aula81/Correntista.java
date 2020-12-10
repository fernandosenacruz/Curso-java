package Aula81;

public class Correntista {
	private int account;
	private String holder;
	private double balance;
			
	public Correntista(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}

	public Correntista(int account, String holder, double inicialDeposit) {
		this.account = account;
		this.holder = holder;
		doDeposit(inicialDeposit);
	}

	public int getAccound() {
		return account;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}


	public void doDeposit(double deposit){
		balance+=deposit;		
	}
	
	public void doWithdraw(double withdraw){
		balance-=withdraw+5.0;
	}

	
	public String toString() {
		return "Account "+account+", Holder: "+holder+", Balance: $ "+String.format("%.2f", balance);
	}
	
	
}



