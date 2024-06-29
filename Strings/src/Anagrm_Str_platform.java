import java.util.*;
public class Anagrm_Str_platform {

	
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter string 1");
	String s1 = sc.next();
	System.out.println("Enter string 2");
	String s2 = sc.next();
	char[] c1 = s1.toCharArray();
	char[] c2 = s2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	if(Arrays.equals(c1,c2))
	System.out.println("ANAGRAM");
	else
	
	System.out.println("NOT ANAGRAM");
	

}
}