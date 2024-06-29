import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter number");
		int num=s.nextInt();
		int i;
		int count=0;
			
		for(i=1;i<=num;i++) {		
			if(num%i==0) {  
			count++;
			}
		}
				
			if(count==2) 
				System.out.println("prime");
			else 
				System.out.println("Not prime");
		
		s.close();
			

	}

}
