package inventory;
import java.util.Stack;
public class Stackexamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stack<Integer>s=new Stack<Integer>();
   s.push(10);
   s.push(12);
   s.push(15);
   s.push(20);
   System.out.println(s);
System.out.println(s.peek());
s.pop();
System.out.println(s);
	}

}
