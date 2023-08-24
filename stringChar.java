/*
Write a Java program to replace a specified character with another character.

Sample Output:

Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown fox jumps over the lazy fog.
 */


public class stringChar {
   public static void main(String args[]){
    String str = "The quick brown fox jumps over the lazy dog";

    System.out.println("Original String: " + str);

      String replaceDog = str.replace("dog", "lion");
      System.out.println(replaceDog);
  }
}
