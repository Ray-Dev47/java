/*
 *  Write a Java program to remove a specific element from a stack.
 */



// Java code to illustrate remove() when position of
// element is passed as parameter

import java.util.*;

public class RemoveStack {
	public static void main(String args[])
	{

		// Creating an empty Stack
		Stack<String> stack = new Stack<String>();

		// Use add() method to add elements in the Stack
		stack.add("Ray");
		stack.add("is");
		stack.add("a");
		stack.add("good");
		stack.add("Programmer");

		// Output the Stack
		System.out.println("Stack: " + stack);

		// Remove the element using remove()
		String rem_ele = stack.remove(3);

		// Print the removed element
		System.out.println("Removed the element good: "
						+ rem_ele);

		// Print the final Stack
		System.out.println("Final Stack: "
						+ stack);
	}
}
