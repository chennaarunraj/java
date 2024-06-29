package Arrays;
import java.util.Scanner;
public class Sum_of_arry_elements {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int sum=0;
   int 	a[]=new int[5];
   System.out.println("Enter Array Elements");
   for(int i=0;i<a.length;i++) {
	a[i]=s.nextInt();   
   }
   System.out.println("Sum of Array Elemnts");
   for(int j=0;j<a.length;j++) {
	 sum=sum+a[j];
   }
   System.out.println(sum);

	}

}
