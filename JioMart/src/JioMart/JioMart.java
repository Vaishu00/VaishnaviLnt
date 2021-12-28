package JioMart;
import java.util.Scanner;
import java.util.*;

interface Offer{
	abstract public void get_offer();
	
}

class Discount implements Offer
{   static int price;
    static  int num;
    static  double total;
    int discount=20;
    
    public static void order_placed() {
    	
    	System.out.println("your order is successfully placed");
    }
	public double total_bil(double total) {
    double s=100-discount;
	double amount = (s*total)/100;
    this.total=total;
	return amount;
	}
	public void get_offer()
	{
		System.out.println("1.If your bill is greater than 1000 then you will get 5 points ");
		System.out.println("2.If your point is greater than 20 then you will get 10% discount extra ");
		System.out.println("3.Offer is limited for last 15 days!!!");
	}
}
class Get_point extends Discount
{
	private int point;
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point=point;
	}
	Get_point()
	{
		
	}
	Get_point(int point){
		this.point = point;
	}
}
public class JioMart extends Get_point{
	static
	{
		System.out.println("-----------------------Welcome to JIO MART!!!!------------------------");
		System.out.println("----------------------------------------------------------------------");
		
	}
	public static void  main(String[] args)
	{  JioMart ref = new JioMart();
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String custermor_Name=sc.next();
		System.out.println("Enter your mobile number: ");
		long mobileNumber=sc.nextLong();
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("1.Rice = 40/-");
		System.out.println("2.Dal = 30/-");
		System.out.println("3.Oil = 100/-");
		System.out.println("4.Biscuits = 20/-");
		System.out.println("5.Tea = 100/-");
		System.out.println("6.Sugar = 50/-");
		System.out.println("7.Nuts = 200/-");
		System.out.println("8.Beans = 100/-");
		System.out.println("9.Pasta = 200/-");
		System.out.println("10.Saop = 120/-");
		System.out.println("11.Press 0 for total price. ");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Enter your option for select product: ");
		;
		
		do {
			num=sc.nextInt(); 
			if(num==0)
				break;
		switch(num) {
		case 1:
			System.out.println("Rice");
			price=40;
			break;
		case 2:
			System.out.println("Dal");
			price=30;
			break;
		case 3:
			System.out.println("Oil");
			price=100;
			break;	
		case 4:
			System.out.println("Biscuit");
			price=20;
			break;	
		case 5:
			System.out.println("Tea");
			price=100;
			break;	
		case 6:
			System.out.println("Sugar");
			price=50;
			break;
		case 7:
			System.out.println("Nuts");
			price=200;
			break;	
		case 8:
			System.out.println("Beans");
			price=100;
			break;
		case 9:
			System.out.println("Pasta");
			price=200;
			break;	
		case 10:
			System.out.println("Saop");
			price=120;
		break;	
	    default:
	    System.out.println("Please enter right option");
	    price=0;
			
		}
		total= total+price;
		
	}while(num>0);
		order_placed();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Total price: " + total);
		System.out.println("You are getting discount: 20% !!!!!!");
		System.out.println("Your total bill: " + ref.total_bil(total));
		Get_point ref1 = new Get_point(3);
		ref1.setPoint(5);
		System.out.println("Your point for next shoping: " + ref1.getPoint());
		Offer ref2 = new Discount();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("---------------NEW OFFER----------------");
		ref2.get_offer();
		
	}
}

