package Arrays;
import java.util.Scanner;
public class Bubblesortwthout_predefined_mtds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
   int a[]=new int[10];
   System.out.println("Enter array elements");
  
    for (int i=0;i<a.length;i++) {
    	  a[i]=s.nextInt();	
    }

    for(int i=0;i<a.length;i++) {
    	for(int j=i+1;j<a.length;j++) {
    		if(a[i]>a[j]) {
    			
    			int temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    		}
    	}
    }
    System.out.println("After sort");
    for(int i=0;i<a.length;i++) {
    	System.out.print(a[i]);
    }
	}

}
