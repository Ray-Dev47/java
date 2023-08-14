/*
 * Write a Java program to find the top and bottom elements of a given stack.
 */



// Java code to illustrate lastElement()
import java.util.*;

public class first_LastStack {
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

		// Displaying the last element
		System.out.println("The last element is: "
						+ stack.lastElement());
		System.out.println("The first element is: "
						+ stack.firstElement());
	}
}
