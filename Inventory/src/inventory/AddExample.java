package inventory;
import java.util.Stack;

public class AddExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(10); // Adds 10 to the stack
        stack.add(20); // Adds 20 to the stack
        System.out.println("Stack after add operations: " + stack);
    }
}
