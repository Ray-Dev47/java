/*
Write a Java program to get the last day of the current month.
*/


import java.util.Calendar;
// import java.util.Date;

public class dateClass {
       public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getTime());
    }
}

