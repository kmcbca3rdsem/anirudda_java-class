package Assignment.Lab4;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");

        System.out.println("Stack after pushing elements:");
        System.out.println(stack);

        System.out.println("\nPopping elements from the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}