/*
Write a Java method to compute the sum of digits in an integer.
Test Data:
Input an integer: 25
Expected Output:

The sum is 7 
*/

import java.util.Scanner;
public class javaMethods {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        int num = in.nextInt();
        in.close();

        System.out.print("Digit sum: " + count_digit(num) +"\n");
    }

     static int count_digit(int num){
         int sum = 0;

         while(num != 0){
            sum = sum + num % 10;
            num = num / 10;
         }
        //   System.out.println ("Sum of digits : " + sum);
        return sum;
    }

}


