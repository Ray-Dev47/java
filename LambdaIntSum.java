/*
ava 8 introduces several new language features designed to make it easier to write such blocks of code-the key feature being lambda expressions, also colloquially referred to as closures or anonymous methods. A lambda expression is just a shorter way of writing an implementation of a method for later execution.

1. Write a Java program to implement a lambda expression to find the sum of two integers.
*/

interface LambdaIntSum {
     int findSum(int a, int b);
  public static void main(String[] args) {
      //  below is the lambda expression
      LambdaIntSum LambdaIntSum  = (x,y) -> (x + y);
      int  total = LambdaIntSum.findSum(5, 7);
      System.out.println(total);
   
  }
}
