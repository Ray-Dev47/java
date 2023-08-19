/*
Write a Java program to get the current date and time.
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
// import java.util.Date;

public class dateClass {
       public static void main(String[] args) {
         DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Calendar cal = Calendar.getInstance();
System.out.println(dateFormat.format(cal.getTime()));

          
          
    }
}

