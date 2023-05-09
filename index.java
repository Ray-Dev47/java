/*
Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
 */

// import java.util.*;
import java.util.*;

public class index {
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();  
		System.out.print("Input the second number: ");
		int b = in.nextInt(); 
		int divided = a / b;
		int result = a - (divided * b);
          in.close();
          
		System.out.println(result); 
     }

    
}
