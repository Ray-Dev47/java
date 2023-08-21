/*
Write a Java method to find the smallest number among three numbers.
*/

import java.util.Scanner;
import java.lang.Math;
public class javaMethods {
 
    public static void main(String[] args) {
         System.out.println("Please input integers");
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter integer one");
         int inp1 = sc.nextInt();
         System.out.println("Please enter integer two");
         int inp2 = sc.nextInt();
         System.out.println("Please enter integer three");
         int inp3 = sc.nextInt();

         sc.close();
         System.out.println("The minimum input is: " + minInput(inp1, inp2, inp3) +"\n");


    }
    public static double minInput(double a, double b, double c){
        return  Math.min(Math.min(a,b),c);
    }
}

