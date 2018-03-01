
public class SavingsAccount {
	String UN;
	int Pin;
	double balance;
	public SavingsAccount(String UN, int Pin, double balance) {
		this.UN=UN;
		this.Pin=Pin;
		this.balance=balance;}

	public double Withdraw(double ammount) {

		double remaining_balance=(balance-ammount);

		return remaining_balance;
	}

	public double Deposit(double ammount) {
		double total_balance=(balance+ammount);

		return total_balance;



	}

}
