import java.util.Scanner;
public class Scannerdemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter student id");
		int sid=s.nextInt();
		System.out.println("Enter student name");
		String name=s.next();
		System.out.println("Enter the marks");
		double marks=s.nextDouble();
		System.out.println("Sid="+sid+"\n"+"Name="+name+"\n"+"Marks="+marks);
	}

}
