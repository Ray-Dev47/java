/*
Write a Java program to get the number of days in a month.
*/



// import java.time.YearMonth;
// import java.util.Calendar;
// import java.util.Date;
import java.time.YearMonth;
 
public class dateClass {
 
    public static void main(String[] args) {
        // Get number of days in given month of the year
        int numberOfDaysInMonth1 = getNumberOfDaysInMonth(2023, 7);
        System.out.println("Number of days in july 2023: "+numberOfDaysInMonth1);
 
        int numberOfDaysInMonth2 = getNumberOfDaysInMonth(2023, 9);
        System.out.println("Number of days in Sept 2023: "+ numberOfDaysInMonth2);
 
    }
 
    // Method to get number of days in month
    public static int getNumberOfDaysInMonth(int year,int month)
    {
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        return daysInMonth;
    }
}

