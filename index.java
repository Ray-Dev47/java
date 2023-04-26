// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class index {
    public static void main(String args[]) {
          Scanner scan = new Scanner(System.in);
            System.out.println("Enter first number"); 
            double num1 = scan.nextDouble();   
            System.out.println("Enter Second number");
            double num2 = scan.nextDouble();
            System.out.println("Enter third number");
            double num3 = scan.nextDouble();
            scan.close();           

            System.out.print("The average of the 3 numbers are  " + average(num1,num2,num3));
          
    }
    public static double average(double a, double b, double c){
        return  (a + b + c)/3;
    }
}