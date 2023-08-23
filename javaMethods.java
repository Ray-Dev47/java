/*
Write a Java method to display the current date and time.

Expected Output:

Current date and time: Wednesday January 25, 2017 7:47:43
*/


// public class javaMethods {
//   public static void main(String[] args)
//     {
//          System.out.println( getDateTime());
//     }

//    public static double getDateTime() {
       
//         return ;
//     }
// }

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
// import java.util.Date;

public class javaMethods {
       public static void main(String[] args) {
         DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Calendar cal = Calendar.getInstance();
System.out.println(dateFormat.format(cal.getTime()));

          
          
    }
}
