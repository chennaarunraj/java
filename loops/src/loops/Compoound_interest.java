package loops;

import java.util.Scanner;
public class Compoound_interest {

			public static void main(String[] args) {
			 Scanner s=new Scanner(System.in);
			 System.out.println("Enter principle");
			 double principle_amt=s.nextInt();
			 System.out.println("Enter time in years");
			 double time_prd=s.nextInt();
			 System.out.println("Enter rate of interest");
			 double rate_of_int=s.nextInt();
			 
			
			 double simple_interest=(principle_amt*time_prd*rate_of_int)/100;
			 System.out.println("SI="+simple_interest);
			  
			 double compound_interest= principle_amt * Math.pow(1 + (rate_of_int / 100), time_prd) - principle_amt;
			 System.out.println("CI="+String.format("%.2f",compound_interest));
			 
	}

}
