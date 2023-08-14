/*
Write a Java program to compare a given string to the specified character sequence.

Sample Output:

Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false
 */

public class CompareString {
public static void main(String[] args)
    {
        String str1 = "example.com";
        String str2 = "Example.com";

        CharSequence cs = "example.com";
        
        System.out.println("Comparing "+str1+" and "+cs+": " + str1.contentEquals(cs));
      System.out.println("Comparing "+str2+" and "+cs+": " + str2.contentEquals(cs));
       
       
       
    }
}
