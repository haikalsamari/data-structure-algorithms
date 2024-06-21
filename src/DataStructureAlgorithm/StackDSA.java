package DataStructureAlgorithm;
import java.util.Stack;

public class StackDSA {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();

        // First check of the stack.
        System.out.println("First check: " + stack.empty());

        // Push few items to stack.
        stack.push("Dumbbell");
        stack.push("Barbell");
        stack.push("Weight");
        // Then, do second check.
        System.out.println("Second check: " + stack.empty());
        // Display all items in stack.
        System.out.println("Display first batch of items: " + stack);

        // Pop item from stack.
        System.out.println("Pop item: " + stack.pop());
        // Display all items in stack.
        System.out.println("Display second batch of items: " + stack);

        // Peek item from stack.
        System.out.println("Peek top item: " + stack.peek());

        // Search for item in stack.
        System.out.println("Found at index: " + stack.search("Dumbbell"));
        // If item is not in the stack, it returns -1.
        System.out.println("No item found: " + stack.search("Weight"));
    }
}
