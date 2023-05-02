// Write a Java program to count the letters, spaces, numbers and other characters of an input string
/*
 * Expected Output
The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6
 */

import java.util.Scanner;

public class index{

    public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
          
         System.out.println("Enter any string"); 
         String strInput = scan.nextLine();
         countMethod(strInput);

         scan.close();
    }

    private static void countMethod(String str) {
        char[] ch = str.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int otherChars = 0;

        for(int i = 0; i < str.length(); i++){
            if( Character.isLetter(ch[i])){
                letter++;
            }
            else if(Character.isDigit(ch[i])){
                num++;
            }
            else if(Character.isSpaceChar(ch[i])){
                space++;
            }
            else{
                otherChars++;
            }
        }
        System.out.println("Entered str: " + str);
        System.out.println("Letter: " + letter);
        System.out.println("number: " + num);
        System.out.println("Space: " + space);
        System.out.println("Other: " + otherChars);
    }     
}


