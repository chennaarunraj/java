import java.util.Scanner;
public class Sum_even__prod_odd{
 public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the no.of values to be entered");
int n=s.nextInt();
int sum=0,prod=1;
int i=1;
while(i<=n) {
	System.out.println("Enter value");
	int num=s.nextInt();
if(num%2==0) 
sum=sum+num;	
else
	prod=prod*num;
i++;
}
System.out.println("sum of even="+sum);
System.out.println("product of odd="+prod);
	
}}
