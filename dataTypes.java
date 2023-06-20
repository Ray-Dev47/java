/*
task-411-program-to-display-n-terms-of-natural-numbers-and-their-sum
Write a Java program to find the number of days in a month.



Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days
*/

import java.util.Scanner;
public class dataTypes{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a month number:  ");
        int month = in.nextInt();
        System.out.print("Input a year  ");
        int year = in.nextInt();

        // int month, year;
        // month = 12;
        // year = 2012;
        if((month==2) && ((year%4==0) || ((year%100==0)&&(year%400==0))))
            System.out.println(year + " has 29 days");

        else if(month==2)
            System.out.println(year + " has 28 days");

        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            System.out.println(year + " has 31 days");

        else
            System.out.println(year  + " has 30 days");
       in.close();
    }
    
    
}
