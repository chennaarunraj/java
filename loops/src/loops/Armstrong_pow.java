package loops;
import java.util.Scanner;
public class Armstrong_pow {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check armstrong");
		int num=s.nextInt();
		int temp=num;
		int count=0;
        
		while(num!=0) {
        num=num/10;
        count++;
       
        }
		num=temp;
		int d;
		double sum=0;
		while(num!=0) {
			d=num%10;	
			sum=sum+(Math.pow(d,count));
			num=num/10;
		}
        if(temp==sum)
        	System.out.println("Armstrong");
        else
        	System.out.println("Not Armstrong");
        	
        	
        }
	
	}
