
public class String_chararray {

	public static void main(String[] args) {
	String s="Narendra";
	int count=0;
	//char c[] = null;
	for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(c=='a') {
		count++;
	}	
	}
	
	System.out.println(count);
	}

}
