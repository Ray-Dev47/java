/*
Write a Java program to get the contents of a given string as a character array.

Sample Output:

The char array equals "[C@2a139a55"
 */

import java.util.Arrays;

public class stringChar {
   public static void main(String args[]){
      String name = "Raymond";

      char[] nameArr = name.toCharArray();

      System.out.println(Arrays.toString(nameArr));
    }
}
