package Arrays;
import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
       System.out.println("Enter size of element");
       int n=s.nextInt();
       int a[]=new int[n];
       System.out.println("Enter array elements");
       for(int i=0;i<a.length;i++) 
    	   a[i]=s.nextInt();
    	   int min=a[0];
    	   int max=a[0];
    	   for(int i=0;i<a.length;i++) {   
          if(a[i]>max)
    	  a[i]=max;
    	  if(a[i]<min)
    	   min=a[i];}
System.out.println(max);
System.out.println(min);

s.close();
}}
