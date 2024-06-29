import java.util.*;
public class String_palindrome {
		
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s= sc.next();
char[] c = s.toCharArray();
int i=0;
int j= c.length -1;
int flag = 0;
for(i=0; i<c.length;i++) {
if(c[i] != c[j]) {
flag = 1;
}
j--;
}
if(flag==0)
System.out.println("palindrome");
else
		
System.out.println("Not palindrome");
		
		
}
}

	

