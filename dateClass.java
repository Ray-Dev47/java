/*
Write a Java program to get the current time in New York.
 */

import java.util.Calendar;
// import java.util.Date;
import java.util.TimeZone;

public class dateClass {
       public static void main(String[] args) {
          Calendar ny_time =  Calendar.getInstance();
          ny_time.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println("Current Time in New York: " + ny_time.get(Calendar.HOUR_OF_DAY) + ":"
		+ ny_time.get(Calendar.MINUTE)+":"+ny_time.get(Calendar.SECOND));
          
    }
}

