//   Write a Java program that accepts three integers from the user. It returns true if the second number is higher than the first number and the third number is larger than the second number. If "abc" is true, the second number does not need to be larger than the first number.
/*
 */

import java.util.Scanner;
public class index {

	public static void main(String args[])   {
        Scanner sc = new Scanner(System.in);
             System.out.println("Input an integer to get the time");
             int time = sc.nextInt();
             int hours = time / 3600;
             int minutes = (time % 3600) / 60;
             int seconds = time % 60;
        sc.close();
         System.out.println(hours + ":" + minutes + ":" + seconds );
    }
}




