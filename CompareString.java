/*
Write a Java program to concatenate a given string to the end of another string.

Sample Output:

String 1: PHP Exercises and                                                                                   
String 2: Python Exercises                                                                                    
The concatenated string: PHP Exercises and Python Exercises
 */

public class CompareString {
public static void main(String[] args)
    {
        String str1 = "PHP Exercises and";
        String str2 = "Python Exercises";
        
        System.out.println(str1.concat( str2));
        System.out.println(str1 + " " + str2);
       
       
       
    }
}
