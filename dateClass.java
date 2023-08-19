/*
Write a Java program to get the last day of the current month.
*/


import java.util.Calendar;
// import java.util.Date;

public class dateClass {
       public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        System.out.println("last day of the current month: " + calendar.getActualMaximum(Calendar.DATE));
    }
}

