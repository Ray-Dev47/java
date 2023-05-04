//  Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd
/*
 */
import java.util.Scanner;

public class index {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Please enter integer to check if odd or even");
		int num = sc.nextInt();
        
            if(num % 2 == 0){
                System.out.println("1....Even");
            } else if(num % 2 != 0){
                System.out.println("0....Odd");
            }
        sc.close();
	}
}



