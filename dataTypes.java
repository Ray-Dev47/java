
/*
Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius

**/
import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit");
        double degFaht = scan.nextDouble();

        scan.close();

        // (°F) - 32) * 5/9
        System.out.println(degFaht + " degree Fahrenheit is equal to " + convert(degFaht) + " in Celsius.");
    }
    static double convert(double f) {   
        // return (((f) - 32) * (5/9));
        return (0.555 * (f - 32));
    }
}
