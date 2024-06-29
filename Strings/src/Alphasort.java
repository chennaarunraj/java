
import java.util.*;

class Alphasort {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();
        
        // Convert the string to a character array
        char[] charArray = s.toCharArray();
        
        // Sort the character array
        Arrays.sort(charArray);
        
        // Convert the sorted array back to a string
        String sortedString = new String(charArray);
        
        // Print the sorted string
        System.out.println(sortedString);
        
        sc.close();
    }
}
