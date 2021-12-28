package JioMart;
import java.util.Scanner;

public class factor {
	public static void main() {
	Scanner sc= new Scanner(System.in);
	int num = sc.nextInt();
	int n = sc.nextInt();
	int sum=0;
	if(num>0 && num<=100000) {
		System.out.println("num");
		for (int i=1; i<=n; ++i) {
			if(n %i == 0 && n==i) {
				sum=sum+i;
				System.out.println(sum);
			}
		}
	}
	}
}
