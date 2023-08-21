/*
Write a Java program to get the number of days in a month.
*/



// import java.time.YearMonth;
// import java.util.Calendar;
// import java.util.Date;
import java.text.DateFormatSymbols;
// import java.time.YearMonth;
import java.util.Locale;
 
public class dateClass {
 
    public static void main(String[] args) {
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("en"));
// for the current Locale :
//   DateFormatSymbols symbols = new DateFormatSymbols(); 
String[] dayNames = symbols.getShortWeekdays();
for (String s : dayNames) { 
   System.out.print(s + " ");
}
 
    }

}

