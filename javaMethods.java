/*
Write a Java method to check whether a year (integer) entered by the user is a leap year or not.

Expected Output:

Input a year: 2017                                                                        
false
*/

import java.util.Scanner;
public class javaMethods {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = in.nextInt();
        in.close();

        System.out.print("Inputed year: " + leap_year(year) +"\n");
    }

     static int leap_year(int num){
         boolean leap = false;

        // if the year is divided by 4
    if (num % 4 == 0) {

        // if the year is century
        if (num % 100 == 0) {
  
          // if year is divided by 400
          // then it is a leap year
          if (num % 400 == 0)
            leap = true;
          else
            leap = false;
        }
        
        // if the year is not century
        else
          leap = true;
      }
      else
      leap = false;

    if (leap)
      System.out.println(num + " is a leap year.");
    else
      System.out.println(num + " is not a leap year.");
    return num;
    }

}


