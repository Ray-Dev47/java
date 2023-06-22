/*
<<<<<<< HEAD
task-401-get-a-number-from-the-user-and-print-whether-it-is-positive-or-negative
Write a Java program to get a number from the user and print whether it is positive or negative.
=======
task-411-program-to-display-n-terms-of-natural-numbers-and-their-sum
Write a Java program to find the number of days in a month.


>>>>>>> 842b75539fba93a50e7e758ad8ce8c4c5f6b49e7

Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
<<<<<<< HEAD
=======
February 2016 has 29 days
>>>>>>> 842b75539fba93a50e7e758ad8ce8c4c5f6b49e7
*/

import java.util.Scanner;
public class dataTypes{

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input a");
       double a = sc.nextDouble();
       System.out.println("Input b");
       double b = sc.nextDouble();
       System.out.println("Input c");
       double c = sc.nextDouble();

       double result = b * b - 4.0 * a * c;

       if (result > 0.0) {
           double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
           double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
           System.out.println("The roots are " + r1 + " and " + r2);
       } else if (result == 0.0) {
           double r1 = -b / (2.0 * a);
           System.out.println("The root is " + r1);
       } else {
           System.out.println("The equation has no real roots.");
       }
    //    }
       sc.close();
    }
}
