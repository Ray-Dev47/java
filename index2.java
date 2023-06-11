/*
Write a Java program to transform a given integer into String format.

Expected Output:
Input an integer: 35
String format of the said integer: 35
 */

 import java.util.Scanner;

public class index2 {	
     public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             
             System.out.println("Input an integer");
             int num = sc.nextInt();
             System.out.println(num + 100);  // 500
             String str = Integer.toString(num);
             sc.close();
             System.out.println(str + 100);  // 400100
         }
         
 }
 




