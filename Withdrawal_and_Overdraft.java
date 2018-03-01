import java.util.Scanner;
public class Withdrawal_and_Overdraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("What is your username?");
		String un=in.next();
		System.out.println("What is your Pin number?");
		int pin=in.nextInt();
		System.out.println("What is your account balance");
		double Balance=in.nextDouble();
	
		SavingsAccount CurrentAccount= new SavingsAccount(un,pin,Balance);
		System.out.println("User Name:"+ CurrentAccount.UN);
		System.out.println("Pin:"+ CurrentAccount.Pin);
		System.out.println("Balance:"+CurrentAccount.balance);
		
		System.out.println("Are you withdrawing or depositting");
		String action=in.next();
		if(action.equals("withdrawing")){
			System.out.println("How much are you withdrawing");
			double amount=in.nextDouble();
			System.out.println("Current Balance After Withdrawal:"+CurrentAccount.Withdraw(amount));
			
			CurrentAccount.Withdraw(amount);}
		else if(action.equals("depositting")) {
			
			System.out.println("How much are you depositting?");
			double Amount=in.nextDouble();
			CurrentAccount.Deposit(Amount);
			System.out.println("Current Balance After Deposit:"+CurrentAccount.Deposit(Amount));
		
		}
			
	}

}
