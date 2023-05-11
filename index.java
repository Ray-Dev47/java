
/*
Write a Java program to create a string taking the first three characters from a given string. If the string length is less than 3 use "#" as substitute characters. Go to the editor
Test Data: Str1 = " "
Sample Output:

###
 */
// import java.lang.*;
import java.util.Scanner;

public class index {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Please enter first String");
          String str1 = sc.nextLine();
          if (str1.length() >= 3) {
               System.out.println(str1.substring(0, 3));

          } else if (str1.length() == 1)
               System.out.println((str1.charAt(0) + "##"));
          else
               System.out.println("###");

          sc.close();
     }
}
