/*
  Write a Java program to get the character (Unicode code point) at the given index within the string.

 */

    public class countStringUnicode {
         
      public static void main(String[] args) {

       String word = "w3resource.com";     
       System.out.println("Original: " + word); 

       int count = word.codePointCount(4,8);

        System.out.println("After count: " + count); // 4

      }
    }