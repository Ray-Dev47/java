/*
Write a Java program to insert a word in the middle of another string. Go to the editor
Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
Sample Output:

Python Tutorial 3.0
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

