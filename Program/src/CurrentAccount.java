import java.util.*;
public class CurrentAccount extends BankAccount {
	private double overdraflimitAccount=500;
	private double amount;
	private double balance;
	Scanner sc=new Scanner(System.in);
	public CurrentAccount() {
		super();
		
	}

	public CurrentAccount(int accountNo, double accountBalance, String accountPassword, double overdraflimitAccount) {
		super(accountNo, accountBalance, accountPassword);
	this.overdraflimitAccount=overdraflimitAccount;
	}
	public void display()
	{
		super.display();
		System.out.println("accountbalance :"+balance);
		System.out.println("your overdraflimitAccount should be ="+this.overdraflimitAccount);
	}
	public void withdraw() {
		System.out.println("please enter withdraw amount");
		amount=sc.nextDouble();
		if(amount<(getAccountBalance()))
		{
	
			this.balance=getAccountBalance()-amount;
			
			System.out.println("your balance amount="+balance);
		}
		else if(amount>(getAccountBalance()))
		{
			this.overdraflimitAccount=overdraflimitAccount-(amount-(getAccountBalance()));
			System.out.println("your overdraflimitAccount should be ="+this.overdraflimitAccount);
			this.balance=0;
			System.out.println("your balance amount="+balance); 
		}
		
	}
	public double getOverdraflimitAccount() {
		return overdraflimitAccount;
	}

	public void setOverdraflimitAccount(double overdraflimitAccount) {
		this.overdraflimitAccount = overdraflimitAccount;
	}
	
}
