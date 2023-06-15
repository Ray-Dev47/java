
/*
Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive
*/

import java.util.Scanner;
public class dataTypes{

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input number");
       int num = sc.nextInt();

       if(num >= 0 ){
        System.out.println("Number is positive ");
       } else{
        System.out.println("Number is negative ");

       }
       sc.close();
    }
}
