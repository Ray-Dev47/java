//  Write a Java program to print the ascii value of a given character

import java.util.Scanner;
public class index {
  public static void main(String[] args) {
	System.out.println("Enter any button to reveal the ASCII value: ");  
    Scanner scan = new Scanner(System.in);

    char input = scan.next().charAt(0);
    System.out.println("Ascii value of " + input + " is: "  + (int)input);

    scan.close();
  }
}



