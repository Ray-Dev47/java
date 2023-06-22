
    /*
Java Exceptions to handle errors:

Java programming language uses exceptions to handle errors and other exceptional events. An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions.

This section covers how to catch and handle exceptions. It includes try, catch, and finally block, as well as chained exceptions and logging exercises.

1. Write a Java program that throws an exception and catch it using a try-catch block.
*/

import java.util.Scanner;
public class exceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input an integer");
            int nums1 = sc.nextInt();
            System.out.println("Input 2nd integer");
            int nums2 = sc.nextInt();
            sc.close();
            System.out.println("Sum is: " + nums1 + nums2);
        } catch (Exception e) {
            System.out.println("invalid data type entered" + e);   // Something went wrong.
        }
    }
}

