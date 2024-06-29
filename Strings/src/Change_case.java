import java.util.*;
public class Change_case{
public static void main(String args[])
{

	System.out.println("Enter word to change Upper to Lower and Lower to Upper case");
Scanner sc=new Scanner(System.in);
String s= sc.nextLine();
solution(s);
}
public static void solution(String str)
{
char c;
int len = str.length();
StringBuffer strBuffer = new StringBuffer(len);
for (int i = 0; i < len; i++)
{
c = str.charAt(i);
if (Character.isUpperCase(c))
{
c = Character.toLowerCase(c);
}
else if (Character.isLowerCase(c))
{
c = Character.toUpperCase(c);
}
strBuffer.append(c);
}
System.out.println(strBuffer);

}}