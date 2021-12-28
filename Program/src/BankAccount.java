import java.util.*;
public abstract class BankAccount {
	
		private int accountNo;
		private double accountBalance=5000;
		private String accountPassword;
		static String bankName="HBFC BANK";

		static{
			System.out.println("Welcome to HDFC BANk");;
		}
		
	public BankAccount() {}

		public BankAccount(int accountNo, double accountBalance, String accountPassword) {
			this.accountNo = accountNo;
			this.accountBalance = accountBalance;
			this.accountPassword = accountPassword;
		}
		public void inputBankAccount()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("\naccountNo");
			this.accountNo=sc.nextInt();
			System.out.println("accountPassword");
			this.accountPassword=sc.next();
		}
		public void display()
	{
		System.out.println("\naccountNO :"+this.accountNo);
		System.out.println("accountPassword :"+this.accountPassword);
		
	}
		public abstract void withdraw();
		

		public int getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(int accountNo) {
			this.accountNo = accountNo;
		}
		public double getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}
		public String getAccountPassword() {
			return accountPassword;
		}
		public void setAccountPassword(String accountPassword) {
			this.accountPassword = accountPassword;
		}
	}


