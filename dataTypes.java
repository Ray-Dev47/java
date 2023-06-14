
/*
Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804
*/
import java.util.Scanner;
public class dataTypes {

    public static void main(String[] Strings) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input distance in meters ");
        double distance = sc.nextDouble();
        System.out.print("Input hour");
        double hour = sc.nextDouble();
        System.out.print("Input minutes");
        double minutes = sc.nextDouble();
        System.out.print("Input seconds");
        double seconds = sc.nextDouble();


        double timeSeconds = (hour*3600) + (minutes*60) + seconds;
		double  mps = distance / timeSeconds;
		double  kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
        double  mph = kph / 1.609f;

		System.out.println("Your speed in meters/second is "+mps);
		System.out.println("Your speed in km/h is "+kph);
		System.out.println("Your speed in miles/h is "+mph);
        sc.close();
    }
   
}
