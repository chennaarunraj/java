package loops;
//Java program to determine whether 
//the number is Armstrong number or not
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args)
	{
	System.out.println("Enter a number");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int temp=n;
	int num,sum=0;
	
	while(n>0)
	{ 
	num=n%10;
	n=n/10;
	sum=sum+num*num*num;
	}
	if(temp==sum)
		System.out.println("Armstrong");
	else
		System.out.println("NOt an Armstrong");	
	}}