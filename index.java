
/*
 Write a Java program to create a string taking the first and last characters from two given strings. If the length of each string is 0 use "#" for missing characters. Go to the editor
Test Data: str1 = "Python"
str2 = " "
Sample Output:

P#
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
          int len1 = str1.length();
          int len2 = str2.length();
          
          if(len1 >= 1 && len2 >= 1){
                System.out.println(str1.substring(0, 1) + str2.substring(0, 1));
          }
          else if(len1 < 1 || len2 > 1){
               System.out.println( str2.substring(0, 0) + (str2.charAt(0)+"#"));
          } 
          else if(len1 > 1 && len2 < 1){
               System.out.println( str1.substring(0, 0) + (str1.charAt(0)+"#"));
          } else{
               System.out.println("##");
          }

          
          sc.close();
     }
}



//  thier solution
// import java.lang.*;
//  public class Exercise73 {
//  public static void main(String[] args)
//  {
//     String str1 = "Python"; 
// 	String str2 = ""; 
	
// 	int length2 = str2.length();
// 	String result = "";
// 	result += (str1.length() >= 1) ? str1.charAt(0) : '#';
// 	result += (length2 >= 1) ? str2.charAt(length2-1) : '#';
// 	System.out.println(result);
//  }
// }

