// Write a Java program to add two binary numbers.

import java.util.Scanner;
public class index {

    public static void main(String args[]){
        System.out.println("Welcome to Java Program to add two binary numbers");
        Scanner scan = new Scanner(System.in);

        System.out.println(" Please Input first Binary Number");
        String first = scan.nextLine();

        System.out.println("Please input second Binary Number");
        String second = scan.nextLine();

        String addition = add(first, second);
        System.out.println("The addition of two binary numbers is " + addition);

        String  sum = sum(first, second);
        System.out.println("The sum of two binary numbers is " + sum);

        scan.close();
        
    }
    private static String sum(String first, String second) {
        return null;
    }

    //  next is method to 
    /*
     * Java method to calculate sum of two binary numbers this method calculate * sum by first converting binary String to binary numbers and then adding * them using binary arithmetic. * * @param first * @param second
     */

     public static String add(String first, String second){
          int a = Integer.parseInt(first, 2);
          int b = Integer.parseInt(second, 2);

          int sum = a + b;

          return Integer.toBinaryString(sum);

     }
}

