//  Write a Java program to convert a string to an integer.
/*
 */
import java.util.*;
// import java.util.Scanner;
public class index {

	public static void main(String args[])   {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str1 = in.nextLine();
		int result;
        try {
            result = Integer.parseInt(str1);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        in.close();
        System.out.printf("The integer value is: %d",result);
		System.out.printf("\n");
    }
        
}



