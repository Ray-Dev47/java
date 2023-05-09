/*
Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
 */

// import java.util.*;

public class index {
     public static void main(String[] args) {
          // Scanner in = new Scanner(System.in);
          int sum = 1;
          int ctr = 0; 
          int num = 0; 
      
             while (ctr < 100) {
                 num++; 
                 if (num % 2 != 0) { 
                 // check if the number is even
                     if (is_Prime(num)) {
                         sum += num; 
                         ctr++; 
                     }
                 }	
             }
             System.out.println("\nSum of the first 100 prime numbers is: "+sum); 	
          }
      
             public static boolean is_Prime(int num) {
             for (int i = 3; i * i <= num; i+= 2) {
                 if (num % i == 0) {
                     return false; 
                 }
             }
             return true;
     }

    
}
