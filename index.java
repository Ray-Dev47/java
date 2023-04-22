// Write a Java program that takes a number as input and prints its multiplication table up to 10

// ?Method  one
// public class index {

//     public static void main(String args[]) {
//         int num = 8;
//         for(int i = 1; i <= 10; i++){
//             System.out.printf( "%d * %d = %d \n", num, i, num * i);  // works 
//         }
//     }
// }

// ***** Method 2

// Using scanner package for custom input
import java.util.Scanner;

public class index {
    public static void main(String args[]) {
        try (Scanner num = new Scanner(System.in)) {
            System.out.println("Enter any number");
            int ans = num.nextInt();
            for (int i = 1; i <= 10; i++) {                
                System.out.println(ans +" x "+i+" = "+ans*i); // works
            }
        }
        ;
        
    }
}