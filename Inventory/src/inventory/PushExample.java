package inventory;
import java.util.Stack;

public class PushExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10); // Pushes 10 onto the stack
        stack.push(20); // Pushes 20 onto the stack
        System.out.println("Stack after push operations: " + stack);
    }
}
