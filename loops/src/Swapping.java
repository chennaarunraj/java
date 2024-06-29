
public class Swapping {

	public static void main(String[] args) {
		int a=3, b=6;
		System.out.println("before swap");
		System.out.println("a="+a+"\n"+"b="+b);
		//swapping with third variable
		int c=a;
		a=b;
		b=c;
		System.out.println("after swap");
		System.out.println("a="+a+"\n"+"b="+b);
		
		int x=3, y=6;
		System.out.println("before swap");
		System.out.println("x="+x+"\n"+"y="+y);
		//without third variable
		x=x+y;//9
		y=x-y;//3
		x=x-y;//6
		System.out.println("after swap");
		System.out.println("x="+x+"\n"+"y="+y);
	}

}
