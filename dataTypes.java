
/*
Write a Java program that reads a number and displays the square, cube, and fourth power.

Expected Output:
Square: .2f
Cube: .2f
Fourth power: 50625.00
*/
import java.util.Scanner;
public class dataTypes{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double val = in.nextDouble();
        in.close();

        System.out.printf("Square: %12.2f\n", val * val);
        System.out.printf("Cube: %14.2f\n", val * val * val);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
    }
}
