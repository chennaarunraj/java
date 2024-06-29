package Arrays;
import java.util.*;
public class Sum_of_left_rght_dgnl_elmts {

	 
	
 public static void main(String[] args) {
	 int a[][]=new int[3][3];
	  Scanner sc=new Scanner(System.in);
	 for(int i=0;i<a.length;i++)
	 {
	     for(int j=0;j<a.length;j++)
	     {
	         a[i][j]=sc.nextInt();
	     }
	 }
	 int sum=0;
	  for(int i=0;i<a.length;i++){
	     for(int j=0;j<a.length;j++){
	       if(i==j){
	       sum=sum+a[i][j];
	       }
	     }}
	     System.out.println("sum of left diagonal is "+sum);
	     
	 }
	 } 

	


