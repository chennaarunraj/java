package Arrays;
import java.util.Scanner;
public class Matrix_diagonal_addition {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++)	{
			 a[i][j]=s.nextInt();	
			}
			
		}

		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println("Sum of dignl elements"+sum);
	}

}
