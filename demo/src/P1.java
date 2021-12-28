import java.util.Scanner;
public class P1 {	
public static void main(String[] args) {
	System.out.println("enter the the number of units");
	Scanner sc= new Scanner(System.in);
	long units=sc.nextLong();
	double billpay=0;
	if(units<100)
	{
		billpay=units*1.20;
	}
	else if(units<=300){
		billpay=units*1.20+(units-100)*2;
	}
	else if(units>300) {
		billpay=100*1.20+200*2+(units-300)*3;
	}
	
	System.out.println("Bill to pay: " + billpay);
	
}
}
