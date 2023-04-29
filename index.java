//  Write a Java program to compute the area of a polygon.
// Area of a polygon = (n*s^2)/(4*tan(π/n))
// where n is n-sided polygon and s is the length of a side

import java.util.Scanner;

public class index{

    public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Please enter number of polygon side");
         double n_side = scan.nextDouble();
         System.out.println("Please enter length of polygon side");
         double l_side = scan.nextDouble();
         scan.close();
         System.out.println("The area of the hexagon is: " + s(n_side, l_side));
    }

    public static double s(double a, double b){
        //  return (6 * Math.pow(b,2))/(4*Math.tan(3.142/6));
         return (a * Math.pow(b,2))/(4*Math.tan(3.142/a));
    }
}