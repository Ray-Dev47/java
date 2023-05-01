// Write a Java program to reverse a string on input


import java.util.Scanner;

public class index{

    public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
          
         System.out.println("Enter any string"); 
         String str = scan.nextLine();
         char[] ch = str.toCharArray();
         
         scan.close();
         System.out.println("Reversed String is: ");

         int j = ch.length;
         for(int i = j; i > 0; i--){
            System.out.print(ch[i-1]);
         }
    }

        
}