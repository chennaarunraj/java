//Write a java program to take the time in hours from the user using scanner class, then convert the time to minutes  and print it (only value).

import java.util.Scanner;

public class Hrs_to_mins {

	public static void main(String[] args) {
		

				
				Scanner s=new Scanner(System.in);
				
				System.out.print("Enter time in hours: ");	
				int hours=s.nextInt();
				
				int minutes=(hours*60);
				
				System.out.println("The time in minutes is "+minutes);
				
				s.close();
			}
	}


