/*
Write a Java method to count all vowels in a string.
Test Data:
Input the string: w3resource
Expected Output:

Number of  Vowels in the string: 4
*/

import java.util.Scanner;
public class javaMethods {
 
    public static void main(String[] args) {
        System.out.println("Please enter any word");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // char[] c = sc.toCharArray();
        int vowel = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
                 vowel++; 
        }
        
        sc.close();
        System.out.println("Vowels: " + vowel);
    }
}


