/*
task-405-takes-a-number-from-the-user-and-generates-an-integer-between-1-and-7-It-displays-the-weekday-name
Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

Test Data
Input number: 3
Expected Output :
Wednesday
*/

import java.util.Scanner;
public class dataTypes{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        int input = in.nextInt();

         if(input == 1 ){
            System.out.println("Monday");
         } else if(input == 2){
            System.out.println("Tuesday");
         }
         else if(input == 3){
            System.out.println("Wednesday");
         }
         else if(input == 4){
            System.out.println("Thursday");
         }
         else if(input == 5){
            System.out.println("Friday");
         }
         else if(input == 6){
            System.out.println("Saturday");
         }
         else if(input == 7){
            System.out.println("Sunday");
         }
         else {
            System.out.println("Invalid input");
         }
         
       
       in.close();
    }
    
    
}
