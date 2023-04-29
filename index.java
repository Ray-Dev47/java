// Write a Java program to compute the area of a hexagon
// Area of a hexagon = (6 * s^2)/(4*tan(π/6))
// where s is the length of a side

import java.util.Scanner;

public class index{

    public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Please enter integer");

         double side = scan.nextDouble();
         scan.close();
         System.out.println("The area of the hexagon is: " + s(side));
    }

    public static double s(double b){
         return (6 * Math.pow(b,2))/(4*Math.tan(3.142/6));
    }
}