//Write a Java program to reverse a word.
/*
 */


// import java.util.*;
import java.util.Scanner;
 public class index {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a word: ");
	 String line = in.nextLine();
      char [] ch = line.toCharArray();
	 
      int j = ch.length;
         for(int i = j; i > 0; i--){
            System.out.print(ch[i-1]);
         }
      in.close();
    }
}



