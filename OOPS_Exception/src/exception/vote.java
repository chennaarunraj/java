package exception;
import java.util.Scanner;
public class vote {
void accept(int age)throws InvalidAgeException{
	if(age<18)
     throw new InvalidAgeException("age is < 18 years");
	else
		System.out.println("welcome to vote");

}

public static void main(String[] args) throws InvalidAgeException {
	Scanner s=new Scanner(System.in);
	vote v=new vote();
System.out.println("Enter age");
int age=s.nextInt();
 v.accept(age);
}
}