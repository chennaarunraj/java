package Arrays;
import java.util.Scanner;
public class Matrix_addition {
	     public static void main(String[] args) {
	 int a[][]=new int[3][3];
	 int b[][]=new int[3][3];
	 int c[][]=new int[3][3];
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter matrix");
	 for(int i=0;i<a.length;i++)
	 {
	     for(int j=0;j<a.length;j++)
	     {
	         a[i][j]=sc.nextInt();
	     }
	 }
	 System.out.println("Enter second matrix");
	 for(int i=0;i<b.length;i++)
	 {
	     for(int j=0;j<b.length;j++)
	     {
	         b[i][j]=sc.nextInt();
	     }
	 }

	  for(int i=0;i<c.length;i++){
	     for(int j=0;j<a.length;j++){
	       c[i][j]= a[i][j]+b[i][j];
	       System.out.print(c[i][j]+" ");
	      
	     }
	     System.out.println();
	  }
	   

	 }
	 } 
