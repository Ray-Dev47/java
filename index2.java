/*
Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.

Sample Output:
Input first number: 5
Input second number: 1
false
 */

import java.util.Scanner;

public class index2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        double num1 = sc.nextDouble();
        System.out.println("Please enter second number");
        double num2 = sc.nextDouble();

        sc.close();

        // if (num1 >= 0 && num1 <=1 && num2 >= 0 && num2 <=1) {
        //     System.out.println("True");
        // } else {
        //     System.out.println("False");
        // }
        // better method
        System.out.println(num1 >= 0 && num1 <=1 && num2 >= 0 && num2 <=1);

    }
}
