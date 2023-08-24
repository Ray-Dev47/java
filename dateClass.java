/*
Write a Java program to create a Date object using the Calendar class.
 */

import java.util.Calendar;

public class dateClass {
       public static void main(String[] args) {
          Calendar calendar =  Calendar.getInstance();
          System.out.println("The current date is: " + calendar.getTime() );
    }
}

