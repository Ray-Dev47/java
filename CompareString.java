/*
Write a Java program to check whether a given string ends with another string.

Sample Output:

"Python Exercises" ends with "se"? false                                                                      
"Python Exercise" ends with "se"? true
 */

public class CompareString {
public static void main(String[] args)
    {
       String str1 = "Python Exercises";
       String str2 = "Python Exercise";

       System.out.println(str1.endsWith("se"));
       System.out.println(str2.endsWith("se"));
    }
}
