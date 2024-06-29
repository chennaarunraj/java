
public class String_literal {

	public static void main(String[] args) {
	String s1="Arun";
	int count=0;
	 char ch[]=s1.toCharArray(); 
	for(int i=0;i<ch.length;i++) {	// (or) for(int i=0;i<s1.length();i++)
	if(ch[i] == 'A') {
		count++;
	}
	}
System.out.println("count= "+count);
}
}
