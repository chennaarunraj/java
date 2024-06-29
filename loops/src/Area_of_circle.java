
import java.util.Scanner;
public class Area_of_circle {
	

	public static void main(String[] args) {
		//Write a java program to take radius from user and print the area of circle (rounded to 2 decimals). 
				Scanner ac=new Scanner(System.in);
				
				System.out.print("Enter the radius: ");
				float radius=ac.nextFloat();
				
			    double pi=3.142;
				
				double area=(pi*radius*radius);
				System.out.printf("%.2f", area);
				
				ac.close();

	}

}
