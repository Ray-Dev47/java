/*
Write a Java program to get and display information (year, month, day, hour, minute) about a default calendar.
 */

import java.util.Calendar;
// import java.util.Date;

public class dateClass {
       public static void main(String[] args) {
          Calendar calendar =  Calendar.getInstance();
          System.out.println("The current year is: " + calendar.get(Calendar.YEAR));
          System.out.println("The current month is: " + calendar.get(Calendar.MONTH));
          System.out.println("The current day is: " + calendar.get(Calendar.DAY_OF_MONTH));
          System.out.println("The current hour is: " + calendar.get(Calendar.HOUR_OF_DAY));
          System.out.println("The current minute is: " + calendar.get(Calendar.MINUTE));
    }
}

