/*
Write a Java method to display the middle character of a string.
Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
Test Data:
Input a string: 350
Expected Output:
                                                                     
The middle character in the string: 5
*/

import java.util.Scanner;
public class javaMethods {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = UserMainCode.getMiddleChars(s);
        System.out.println(s1);
        sc.close();
    }
}
class UserMainCode {
    public static String getMiddleChars(String str) {
       int index, length;
       if(str.length()%2==0){
           index = str.length() / 2 -1;
           length = 2;
       }
       else{
           index = str.length() / 2;
           length = 1;
       }
       return str.substring(index,index+length);
    }
       
}

