//  Write a Java program to convert a octal number to a decimal number.

import java.util.Scanner;

// import java.util.*;


public class index {
 
public static void main(String[] args) 
   {
     Scanner in = new Scanner(System.in);
     long octal_num, decimal_num = 0;
     int i = 0;
     System.out.print("Input any octal number: ");
    octal_num = in.nextLong();
    while (octal_num != 0) 
     {
      decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
      octal_num = octal_num / 10;
     }
     in.close();
    System.out.print("Equivalent decimal number: " + decimal_num+"\n");
   }
   
}
