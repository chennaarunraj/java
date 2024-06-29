import java.util.*;
public class Anagram {	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
                System.out.println("Enter two Strings");
		        String s1 = sc.next();
		        String s2 = sc.next();

		        // Check if the two strings are anagrams
		        if (areAnagrams(s1, s2)) {
		            System.out.println("The strings are anagrams.");
		        } else {
		            System.out.println("The strings are not anagrams.");
		        }

		        sc.close();
		    }

		    // Helper method to check if two strings are anagrams
		    static boolean areAnagrams(String str1, String str2) {
		        // Remove all whitespace and convert strings to lowercase
		        str1 = str1.replaceAll("\\s", "").toLowerCase();
		        str2 = str2.replaceAll("\\s", "").toLowerCase();

		        // Check if length is same
		        if (str1.length() != str2.length()) {
		            return false;
		        }

		        // Convert strings to char array
		        char[] charArray1 = str1.toCharArray();
		        char[] charArray2 = str2.toCharArray();

		        // Sort the char array
		        Arrays.sort(charArray1);
		        Arrays.sort(charArray2);

		        // Return true if sorted char arrays are same
		        return Arrays.equals(charArray1, charArray2);
		    }
		}


	
