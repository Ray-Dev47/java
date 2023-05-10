/*
Write a Java program to create another string of 4 copies of the last 3 characters of the original string. The original string length must be 3 and above. Go to the editor
Sample Output:

3.03.03.03.0 
 */
//import java.lang.*;
 public class index{
 public static void main(String[] args)
 {
   String main_string = "Python 3.0";
      
   String last_three_chars = main_string.substring(main_string.length() - 3);
   System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);
  }
    }

