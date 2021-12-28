import java.util.*;
public class Pro1 {

	public static void main(String[] args) {
		System.out.println("which type of your account: ");
		System.out.println("1.Saving account");
		System.out.println("2.Current account");
		System.out.println("Enter 1 for Saving account");
		System.out.println("Enter 2 for Saving account");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:
			BankAccount ob=new SavingAccount();
			ob.inputBankAccount();
			ob.withdraw();
			ob.display();
			break;
		case 2: 
			BankAccount ob1=new CurrentAccount();
			ob1.inputBankAccount();
			ob1.withdraw();
			ob1.display();
			break;
		}
	}

}
