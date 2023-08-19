/*
Write a Java program to get the minimum value of the year, month, week, and date from the current date of a default calendar.
 */

import java.util.Calendar;
// import java.util.Date;

public class dateClass {
       public static void main(String[] args) {
          Calendar calendar =  Calendar.getInstance();
          System.out.println("The Minimum year is: " + calendar.getActualMinimum(Calendar.YEAR));
          System.out.println("The Minimum year is: " + calendar.getActualMinimum(Calendar.MONTH));
          System.out.println("The Minimum year is: " + calendar.getActualMinimum(Calendar.WEEK_OF_YEAR));
          System.out.println("The Minimum year is: " + calendar.getActualMaximum(Calendar.DATE));
          
    }
}

