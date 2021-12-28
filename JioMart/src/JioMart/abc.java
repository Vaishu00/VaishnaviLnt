package JioMart;
import java.util.Scanner;
public class abc {
		public static void  main(String[] args)
		{   Scanner sc= new Scanner(System.in);
		String d= sc.next();
		 long n=d.length();
		 int counta=0;
		 int countb=0;
		 for(int i =1; i<=n; i++) {
			 
			 char c = d.charAt(i);
			 if('A'==c) {
				 counta++;
			     } 
			 else if('B'==c)
			 {countb++; 
		     }
		}
		 if(counta>countb) {
			System.out.println("Anriban");
		 }
		 else if(counta<countb) {
			 System.out.println("Biwas");
		 }
		 else if(counta==countb) {
			 System.out.println("Samay");
		 }
		}
	}


