/*
program that accepts two integer values between 25 and 75 and returns true if there is a common digit in both numbers
Sample Output:

Input the first number : 12                                            
Input the second number: 13   
true
 */

// import java.util.*;
import java.util.*;

public class index {
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.print("Input the 1st number : ");
          int a = in.nextInt();
          System.out.print("Input the 2nd number: ");
          int b = in.nextInt();
          in.close();
          System.out.println("Result: " + result(a, b));
     }

     public static boolean result(int p, int q) {
         
          if (p<25 || q>75)
		   return false;
	   int x = p % 10;
	   int y = q % 10;
	   p /= 10;
	   q /= 10;
	   return (p == q || p == y || x == q || x == y);
     }
}
