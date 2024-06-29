
public class Reverse_of_string {

	public static void main(String[] args) {
		String s= "Hello world";
		String s1[]=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
			System.out.println(s1[i]);

	}

}
