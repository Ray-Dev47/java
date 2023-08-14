/*
 *  Write a Java program to get the character (Unicode code point) at the given index within the string.
 * 
 * Original String : w3resource.com                                                                              
  Character(unicode point) = 51                                                                                 
  Character(unicode point) = 101 
 */

    public class StringUnicode {
         
      public static void main(String[] args) {

       String word = "w3resource.com";
         int codePoint1 = Character.codePointAt(word, 2);
         int codePoint2 = Character.codePointAt(word, 3);
        
         System.out.println("Character(unicode)" + codePoint1); // 
         System.out.println("Character(unicode)" + codePoint2); //
      }
    }