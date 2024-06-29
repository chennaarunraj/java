import java.util.Scanner;
public class Greatest_of_3 {
	//Write a java program to check the greater number of the given two numbers.
		public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter the first number: ");
			int num1=s.nextInt();
			
			System.out.println("Enter the second number: ");
			int num2=s.nextInt();
			
			if(num1>num2) {
				System.out.println(num1+" is greater than "+num2);
			}
			else {
				System.out.println(num2+" is greater than "+num1);
			}
			
			s.close();
		}

	}


