package Arrays;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++)	{
			 a[i][j]=s.nextInt();	
			}
			
		}
       System.out.println("Array elemnts are::");
       for(int i=0;i<a.length;i++) {
    	   for(int j=0;j<a.length;j++) {
    		   System.out.print(a[i][j]+" ");
    	   }
    	   System.out.println();
       }
       
	}

}
