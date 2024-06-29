import java.util.Scanner;
public class Switchstatmts {

 	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1=s.nextInt();
		
		System.out.println("Enter second number: ");
		int num2=s.nextInt();
		
		System.out.println("Select the operator +, -, *, / :");
		char operator=s.next().charAt(0);
		
		switch(operator) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		default: 
			System.out.println("Select a valid operator.");
		}
		
		s.close();
		}

	}

