/*
task-404-program-that-reads-a-floating-point-number-and-prints-zero-if-the-number-is-zero
Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

/*
task-404-program-that-reads-a-floating-point-number-and-prints-zero-if-the-number-is-zero
Input value: 25
Positive number

*/

import java.util.Scanner;
public class dataTypes{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();

        if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Positive small number");
            }
            else if (input > 1000000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Positive number");
            }
        }
        else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
       
       in.close();
    }
    
    
}
