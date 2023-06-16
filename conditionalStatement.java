
/*
Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant
*/

import java.util.Scanner;
public class conditionalStatement{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an alphabet :  ");
        char ch = in.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            System.out.println(ch + " is vowel");
        } 
        else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                System.out.println(ch + " is vowel");
            }
        // else if(ch > 2){
        //     System.out.println("error");
        // }
        else{
        System.out.println(ch + " is consonant");
    }  
       in.close();
    }
}

// correction
// import java.util.Scanner;
// public class Exercise8 {

    
//   public static void main(String[] args)
//     {
//         Scanner in = new Scanner(System.in);

//         System.out.print("Input an alphabet: ");
//         String input = in.next().toLowerCase();

//         boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
//         boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
//         boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
//                 || input.equals("o") || input.equals("u");

//         if (input.length() > 1)
//         {
//             System.out.println("Error. Not a single character.");
//         }
//         else if (!(uppercase || lowercase))
//         {
//             System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
//         }
//         else if (vowels)
//         {
//             System.out.println("Input letter is Vowel");
//         }
//         else
//         {
//             System.out.println("Input letter is Consonant");
//         }
//     }
// }

