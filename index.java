// Write a Java program to compute the distance between two points on the surface of earth.
/*
 * Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
 */

import java.util.Scanner;

public class index{

    public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
         
         
         System.out.println("Input the latitude of coordinate 1"); // x1 = a 
         double x1 = scan.nextDouble();
         System.out.println("Input the longitude of coordinate 1");  // y1 = b
         double y1 = scan.nextDouble();
        System.out.println("Input the latitude of coordinate 2");  // x2 = c
         double x2 = scan.nextDouble();
         System.out.println("Input the longitude of coordinate 2");  // y2 = d
         double y2 = scan.nextDouble();
         scan.close();
         System.out.println("distance between two points on the surface of earth: " + s(x1,y1,x2,y2) + " km");
    }

         public static double s(double a1, double b1, double a2, double b2){
         // Points will be converted to radians before calculation
         a1 = Math.toRadians(a1);
         b1 = Math.toRadians(b1);
         a2 = Math.toRadians(a2);
         b2 = Math.toRadians(b2);



         double earthRadius = 6371.01;
         return (earthRadius * Math.acos(Math.sin(a1) * Math.sin(a2) + Math.cos(a1) * Math.cos(a2) * Math.cos(b1 - b2)));
    }
}