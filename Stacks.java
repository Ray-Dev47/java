/*
 * Write a Java program to implement a stack with push and pop operations. Find the top element of the stack and check if it is empty or not.
 */


import java.util.Stack;

public class Stacks {
  public static void main(String[] args) {
    Stack <String> idengeliFamily = new Stack<>();

    // add to stack
    idengeliFamily.push("Raymond");
    idengeliFamily.push("Faith");
    idengeliFamily.push("Mike");

    System.out.println("Stack: " + idengeliFamily);
    idengeliFamily.pop();
    System.out.println("After POP: " + idengeliFamily);

    //  Find the top element of the stack
    String peekTop = idengeliFamily.peek();
    System.out.println("Animals at the top: " + peekTop);

    // check if empty or not 
    boolean checkEmpty = idengeliFamily.empty();
    System.out.println("Empty or not? " + checkEmpty);
  }
}