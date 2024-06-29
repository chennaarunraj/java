package inventory;
import java.util.Stack;

public class PopExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack before pop operation: " + stack);
        stack.pop(); // Pops the top element (20) from the stack
        System.out.println("Stack after pop operation: " + stack);
    }
}
