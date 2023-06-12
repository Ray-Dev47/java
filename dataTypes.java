
/*
Write a Java program to compute the body mass index (BMI).

Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721
*/
import java.util.Scanner;
public class dataTypes {

    public static void main(String[] Strings) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Input height in inches: ");
        double height = sc.nextDouble();


        // weight (lb) / [height (in)]2 x 703
        System.out.println("Body Mass Index is: " + BMI(weight,height));
        sc.close();
    }
    public static double BMI(double a, double b){
        return  (a)/(b*b) * 703;

    }
}
