package account;

public class SavingsAccount extends Account {
	private double minimumBalance;
	SavingsAccount(int accountNumber,Customer customerObj,double balance,double minimumBalance){
		super(accountNumber,customerObj,balance);
		this.minimumBalance=minimumBalance;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public boolean withdraw(double amount) {
		if((balance-amount)>minimumBalance) {
			balance=balance-amount;
			setBalance(balance);
			return true;
		}
		else 
			return false;
	}
}
