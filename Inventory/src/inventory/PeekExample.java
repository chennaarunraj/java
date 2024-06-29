package inventory;
import java.util.Stack;

public class PeekExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack before peek operation: " + stack);
        int topElement = stack.peek(); // Peeks at the top element (20) without removing it
        System.out.println("Top element using peek: " + topElement);
        System.out.println("Stack after peek operation: " + stack);
    }
}
