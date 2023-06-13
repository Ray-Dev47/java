/*
Write a Java program to accept two strings and test if the second string contains the first one.

Input first string: Once in a blue moon
Input second string: See eye to eye
If the second string contains the first one? false
 */

 import java.util.Scanner;
 public class index2 {	
  
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Input first string");
         String str1 = sc.nextLine();
         System.out.println("Input second string");
         String str2 = sc.nextLine();
         sc.close();
         System.out.println("If the second string contains the first one? :" + str1.toUpperCase().contains(str2.toUpperCase()));
 
       }
 
 }

 



