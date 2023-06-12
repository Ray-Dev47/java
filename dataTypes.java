
/*
Write a Java program that reads a number in inches and converts it to meters.
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters

**/
import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a value for inch:"); 
        double inch = scan.nextDouble();

        scan.close();

        System.out.println(inch + " degree Fahrenheit is equal to " + convert(inch) + " in Celsius.");
    }
    static double convert(double f) {   
        // return (((f) - 32) * (5/9));
        return (f * 0.0254);
    }
}
