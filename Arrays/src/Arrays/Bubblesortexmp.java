package Arrays;

import java.util.Scanner;

public class Bubblesortexmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        
        // Prompt user to enter array elements
        System.out.println("Enter Array elements");
        for (int i = 0; i < a.length; ++i)
            a[i] = sc.nextInt();
        
        for (int i = a.length - 1; i > 0; i--) {
            // Loop through the array from the beginning to i
            for (int j = 0; j < i; j++) {
                // Compare adjacent elements and swap them if they are out of order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}