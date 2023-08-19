/*
Write a Java program to get the last day of the current month.
*/


// import java.text.DateFormat;
// import java.text.SimpleDateFormat;
import java.time.YearMonth;
// import java.util.Calendar;
// import java.util.Date;

public class dateClass {
       public static void main(String[] args) {
        
       YearMonth ym = YearMonth.of(2016, 9);

	 String firstDay = ym.atDay(1).getDayOfWeek().name();
	 String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
	 System.out.println();
	 System.out.println(firstDay);
 	 System.out.println(lastDay);
	 System.out.println();
    }
}

