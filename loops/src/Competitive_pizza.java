import java.util.Scanner;

public class Competitive_pizza {
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
//		
//		System.out.println("Enter Base:");
//		int base=s.nextInt();
//		System.out.println("Enter Height:");
//		int height=s.nextInt();
//		
//		int size_of_triangle= ((height*base)/2);
//		int size_of_pizza= (4*size_of_triangle);
//		
//		int cost_of_pizza=2*(size_of_pizza);
//		System.out.println("cost of pizza is "+cost_of_pizza);		
	
	
	System.out.println("Enter number");
	int num=s.nextInt();
	int i;
	int count=0;
	
	
	for(i=1;i<=num;i++) {
		
		if(num%1==0) {  
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


