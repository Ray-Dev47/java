
/*
Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).

Test Data
Input 1st integer: 25
Input 2nd integer: 5
Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5
*/
import java.util.Scanner;
public class dataTypes{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first integer ");
        double num1 = in.nextDouble();
        System.out.print("Input second integer ");
        double num2 = in.nextDouble();
        in.close();

        double sum = num1 + num2;
        double difference = num2 - num1;
        double average = (num1 + num2)/2;
        double product = num1 * num2;
        double distance = num2 - num1;
        double maximum = Math.max( num1, num2);
        double minimum = Math.min( num1, num2);

        
        System.out.println("Sum of two integers: " + sum);
        System.out.println("difference of two integers: " + difference);
        System.out.println("average of two integers: " + average);
        System.out.println("product of two integers: " + product);
        System.out.println("distance of two integers: " + distance);
        System.out.println("maximum of two integers: " + maximum);
        System.out.println("minimum of two integers: " + minimum);
    }
}
