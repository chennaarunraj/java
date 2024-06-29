package Arrays;
import java.util.Scanner;

public class Arry {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	int a[]=new int[5];
	
	System.out.println("Enter array Elements");
	for( int i=0;i<a.length;i++)
	    a[i]=s.nextInt();
	System.out.println("The array elemnts are");
	
	for(int j=0;j<a.length;j++)
	System.out.println(a[j]);

for (int i = 5; i >= 0; i -= 2) {
    System.out.print(i + " ");
}

for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
    }
}


for (int i = 1; i <= 5; i++) {
    System.out.print(i + " ");
}
	
}
}


