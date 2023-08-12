/*
 * Write a Java program to count elements in a stack.
 */

import java.util.Stack;

public class clearStack {
    public static void main(String args[])
    {
        // Creating an empty Stack
        Stack<String> stack = new Stack<String>();
  
        // Use add() method to add elements into the Stack
        stack.add("Welcome");
        stack.add("To");
        stack.add("Geeks");
        stack.add("4");
        stack.add("Geeks");
  
        // Displaying the Stack
        System.out.println("Stack: " + stack);
  

  
        // Displaying the final Stack after clearing;
        System.out.println("The Stack is : " + stack.size());
    }
}
