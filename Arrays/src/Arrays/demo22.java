package Arrays;
import java.util.Scanner;
public class demo22 {

	public static void main(String[] args) {
	
		  
		        Scanner sc = new Scanner(System.in);
		        int a[] = new int[5];
		        
		        // Prompt user to enter array elements
		        System.out.println("Enter Array elements");
		        for (int i = 0; i < a.length; ++i)
		            a[i] = sc.nextInt();
		        
		        // Call bubbleSort method to sort the array
		        bubbleSort(a);
		    }

		    // Method to perform bubble sort
		    public static void bubbleSort(int arr[]) {
		        // Loop through the array from the end to the beginning
		        for (int i = arr.length - 1; i > 0; i--) {
		            // Loop through the array from the beginning to i
		            for (int j = 0; j < i; j++) {
		                // Compare adjacent elements and swap them if they are out of order
		                if (arr[j] > arr[j + 1]) {
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }

		        // Print the sorted array
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		    }
		}	// TODO Auto-generated method stub

	


