package loops;
import java.util.Scanner;
public class Sici {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter principle");
	 int principle_amt=s.nextInt();
	 System.out.println("Enter time in years");
	 int time_prd=s.nextInt();
	 System.out.println("Enter rate of interest");
	 int rate_of_int=s.nextInt();
	 
	 
	 int simple_interest=(principle_amt*time_prd*rate_of_int)/100;
	 System.out.println("SI="+simple_interest);
	 
	}
	

}
