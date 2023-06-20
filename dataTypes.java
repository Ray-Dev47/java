/*
task-406-reads-two-floating-point-numbers-and-tests-whether-they-are-the-same-up-to-three-decimal-places
Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.


Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different
*/

import java.util.Scanner;
public class dataTypes{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input floating-point number:  ");
        double num1 = in.nextDouble();
        System.out.print("Input doubleing-point number 2:  ");
        double num2 = in.nextDouble();

         
         
        num1 = Math.round(num1 * 1000);
        num1 = num1 / 1000;

        num2 = Math.round(num2 * 1000);
        num2 = num2 / 1000;
        if(num1 == 2){
            System.out.println("They are equal by up to 3 decimal places ");
        }else{
            System.out.println("They are not equal");
        }
       in.close();
    }
    
    
}
