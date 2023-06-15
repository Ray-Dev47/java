
/*
Write a Java program that takes three numbers from the user and prints the greatest number.

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87
*/

import java.util.Scanner;
public class dataTypes{

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input the 1st number");
       int a = sc.nextInt();
       System.out.println("Input the 2nd number");
       int b = sc.nextInt();
       System.out.println("Input the 3rd number");
       int c = sc.nextInt();

       
       int max = Math.max(a, Math.max(b,c ));
       System.out.println("The greatest is: " + max);
       
       sc.close();
    }
    
    
}
