/*
Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.

Sample Output:
Input first number: 25
Input second number: 37
Input third number: 45
Input fourth number: 23
Numbers are not equal!
 */

import java.util.Scanner;
public class index2 {
    public static void main(String[] args){
        System.out.println((101 + 0) / 3); // 33
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter integer one");
       int num1 = sc.nextInt();
       System.out.println("Please enter integer two");
       int num2 = sc.nextInt();
       System.out.println("Please enter integer three");
       int num3 = sc.nextInt();
       System.out.println("Please enter integer four");
       int num4 = sc.nextInt();
       sc.close();

       if(num1 == num2 && num2 == num3 && num3 == num4 ){
          System.out.println("Numbers are equal");
       } 
      else {
          System.out.println("Numbers are not equal");
       }

    }
}
