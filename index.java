// Write a Java program to find the penultimate (next to the last) word in a sentence.
/*
 */


// import java.util.*;
import java.util.Scanner;
 public class index {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a Sentence: ");
	 String line = in.nextLine();
	 
      String[] word = line.split(" ");
      String lastString = word[word.length - 2];
      in.close();
      System.out.println("Penultimate word: "  + lastString); 
    }
}



