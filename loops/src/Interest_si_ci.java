import java.util.Scanner;
public class Interest_si_ci {
	//Write a java program to calculate SI and CI if principle, time and rate of interest are given as user input.

		public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			
			double principle_amount, interest_rate, time_period;
			
			System.out.println("Enter principle amount: ");
			principle_amount=s.nextDouble();
			System.out.println("Enter intrest rate (annual): ");
			interest_rate=s.nextDouble();
			System.out.println("Enter time period (in years): ");	
			time_period=s.nextDouble();
			
			double simple_interest, compound_interest;		
	//Simple interest formula: S.I. = (P × R × T)/100, where P = Principal, R = Rate of Interest in % per annum, and T = Time, usually calculated as the number of years. The rate of interest is in percentage R% (and is to be written as R/100, thus 100 in the formula).
			simple_interest=(principle_amount*interest_rate*time_period)/100;
			System.out.println("Simple interest is "+simple_interest);
			
	//Compound interest formula: CI = P( 1 + r/n)nt - P		
			compound_interest= principle_amount * Math.pow(1+(interest_rate/100), time_period) - principle_amount;
			System.out.println("Compound interest is "+compound_interest);
				
			s.close();	
		}

	}
