//  capitalize the first letter of each word in a sentence
/*
 */

// import java.util.Scanner;
// public class index {

// 	public static void main(String args[])   {
//         Scanner sc = new Scanner(System.in);
//              System.out.println("Input Strings");
//             String input = sc.nextLine();
//             char[] charArray = input.toCharArray();
//             boolean space = true;

//             for (int i = 0; i < charArray.length; i++) {
//                // check if character is a letter
//                if(Character.isLetter(charArray[i])){

//                     // check if space is in string 
//                     if(space){

//                          // change letter to uppercase
//                          charArray[i] = Character.toUpperCase(charArray[i]);
//                          space = false;
//                     }
//                }
//                else{
//                     // if new character is not a character
//                     space = true;
//                }
//                // convert char Array to the string
//                input = String.valueOf(charArray);
//                System.out.println(input); 
//             } 
//         sc.close();
//           }
//       }




// alternate
import java.util.*;
 public class index {
     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a Sentence: ");
	 String line = in.nextLine();
	 String upper_case_line = "";
      in.close(); 
       Scanner lineScan = new Scanner(line); 
         while(lineScan.hasNext()) {
             String word = lineScan.next(); 
             upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
         }
         lineScan.close();
      System.out.println(upper_case_line.trim()); 
    }
}




