// Write a Java program to multiply two binary numbers.

import java.util.Scanner;
public class index {

    public static void main(String args[]){
        System.out.println("Welcome to Java Program to multiply two binary numbers");
        Scanner scan = new Scanner(System.in);

        System.out.println(" Please Input first Binary Number");
        String first = scan.nextLine();

        System.out.println("Please input second Binary Number");
        String second = scan.nextLine();

        String multiplication = multiply(first, second);
        System.out.println("The multiplication of two binary numbers is " + multiplication);

        String  quotient = quotient(first, second);
        System.out.println("The quotient of two binary numbers is " + quotient);

        scan.close();
        
    }
    private static String quotient(String first, String second) {
        return null;
    }

    //  next is method to 
    /*
     * Java method to calculate quotient of two binary numbers this method calculate * quotient by first converting binary String to binary numbers and then multiplying * them using binary arithmetic. * * @param first * @param second
     */

     public static String multiply(String first, String second){
          int a = Integer.parseInt(first, 2);
          int b = Integer.parseInt(second, 2);

          int quotient = a * b;

          return Integer.toBinaryString(quotient);

     }
}

