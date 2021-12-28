import java.util.*;
public class SavingAccount extends BankAccount {
	private double minimamBalance=500;
	private double amount;
	private double balance;
	Scanner sc=new Scanner(System.in);
	public SavingAccount() {
		super();
	}

	public SavingAccount(int accountNo, double accountBalance, String accountPassword, double minimumBalance) {
		super(accountNo, accountBalance, accountPassword);
		this.minimamBalance= minimumBalance;
		
	}
	public void display()
	{
		super.display();
		System.out.println("accountbalance :"+balance);
		System.out.println("your minimum balance should be ="+this.minimamBalance);
		
	}
	public void withdraw() {
		System.out.println("please enter withdraw amount");
		amount=sc.nextDouble();
		if (amount<=(getAccountBalance()))
		{
	
			this.balance=getAccountBalance()-amount;
			System.out.println("your balance amount="+balance);
		}
		else if(amount>(getAccountBalance())) 
		{this.balance=getAccountBalance();
			System.out.println("your account balance less than :"+amount);
		}
	}
	public double getMinimamBalance() {
		return minimamBalance;
	}

	public void setMinimamBalance(double minimamBalance) {
		this.minimamBalance = minimamBalance;
	}
	
}



	