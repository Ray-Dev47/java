/*
Write a Java program to create a String object with a character array.

Sample Output:

The book contains 234 pages.
 */

public class CompareString {
public static void main(String[] args)
    {
      char[] ch = {'R', 'a', 'y', 'm','o','n', 'd'};
      String str = new String(ch);
       System.out.println(str);
    }
}
