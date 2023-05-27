
/*
Write a Java program to compute the square root of a given number.
Input a positive integer: 25
Square root of 25 is: 5
*/

import java.util.Scanner;
import java.lang.Math;
    public class index {
    
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("input a positive integer");
            double nums = sc.nextDouble();


            sc.close();
            System.out.println("Square root of " + nums + " is " + sqrtCalc(nums));

                         
        }
        public static double sqrtCalc(double a) {
            return Math.sqrt(a);
        }  
    }
