//   Write a Java program that accepts three integers from the user. It returns true if the second number is higher than the first number and the third number is larger than the second number. If "abc" is true, the second number does not need to be larger than the first number.
/*
 */

import java.util.Scanner;
public class index {

	public static void main(String args[])   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Integer");
        int int1 = sc.nextInt();
        System.out.println("Enter the second integer");
        int int2 = sc.nextInt();
        System.out.println("Enter the third integer");
        int int3 = sc.nextInt();

        sc.close();
        
        System.out.println("The result is: " + res(int1, int2, int3));
    }
        public static boolean res(int a,int b,int c){
             return a < b && b < c && a < c ;
        }
}




