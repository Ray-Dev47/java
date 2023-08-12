/*
 * Write a Java program to find the maximum and minimum elements in a stack.
 */


// Java code to reverse a
// stack using recursion
import java.util.Iterator;
import java.util.Stack;

class minMaxStack { //user defined stack class
  Stack < Integer > stk;
  //cons to create object of UIStack class
  minMaxStack() {
    stk = new Stack < Integer > ();
  }

  //to push element into stack
  void push(int ele) {
    stk.push(ele);
    return;
  }
  //it will remove the topmost element from stack
  int pop() {

    if (stk.isEmpty()) {
      System.out.println("Underflow Error: Stack is Empty");
    }
    return stk.pop();
  }

  //to get minimum element from stack O(N)
  int getMin() {
    if (stk.isEmpty()) {
      System.out.println("Underflow Error: Stack is Empty");
    }

    Iterator < Integer > itr = stk.iterator();
    int minElement = stk.peek();
    while (itr.hasNext()) {
      int x = itr.next();
      if (x < minElement)
        minElement = x;
    }
    return minElement;
  }
}
