/*
Write a Java program to compare a given string to another string, ignoring case considerations.

Sample Output:

"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "stephen edwin king"? true 
 */

public class CompareString {
public static void main(String[] args)
    {
       String str1 = "Stephen Edwin King";
       String str2 = "Walter Winchell";
       String str3 = "stephen edwin king";

       System.out.println(str1.equalsIgnoreCase(str2));
       System.out.println(str1.equalsIgnoreCase(str3));
    }
}
