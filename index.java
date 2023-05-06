//  capitalize the first letter of each word in a sentence
/*
 */


import java.util.*;
 public class index {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a Sentence: ");
	 String line = in.nextLine();
	 String lower_case_line = "";
      in.close(); 
       Scanner lineScan = new Scanner(line); 
         while(lineScan.hasNext()) {
             String word = lineScan.next(); 
             lower_case_line += word.toLowerCase(); 
         }
         lineScan.close();
      System.out.println(lower_case_line.trim()); 
    }
}




