/*
Write a Java program to compare a given string to a specified string buffer.

Sample Output:

Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false 
 */

public class CompareString {
public static void main(String[] args)
    {
      String str1 = "example.com", str2 = "Example.com";
      StringBuffer strbuf = new StringBuffer(str1);
      
      System.out.println("Comparing "+str1+" and "+strbuf+": " + str1.contentEquals(strbuf));
      
      System.out.println("Comparing "+str2+" and "+strbuf+": " + str2.contentEquals(strbuf));
       
       
       
    }
}
