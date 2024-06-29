package Arrays;
import java.util.Scanner;
public class Linearsearch {

	public static void main(String[] args) {
		System.out.println("Enter array elements");
		Scanner s=new Scanner(System.in);
	 int a[]=new int[5];
	 for(int i=0;i<a.length;i++) {
		 a[i]=s.nextInt();
	 }
	 System.out.println("Enter search key");
	 int k=s.nextInt();
	 int  flag=0;
	 int j;
	 for( j=0;j<a.length;j++) {
		 if(a[j]==k) {
			 flag=1;
			 break;
		 }
			 
		
		 }
	    if(flag==1) {
	    	System.out.println("Elemnt found "+j);
	    }
	    else {
	    	System.out.println("element not found");
		   
	   }
	 }
      
	}


