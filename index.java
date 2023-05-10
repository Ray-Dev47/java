/*
Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above. Go to the editor
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output: ythonutorial
 */
// import java.lang.*;
import java.util.Scanner;
public class index {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Please enter first String");
          String str1 = sc.nextLine();  
          System.out.println("Please enter second String");  
          String str2 = sc.nextLine(); 
          sc.close();
               System.out.println(str1.substring(1) + str2.substring(1));
     }
}
