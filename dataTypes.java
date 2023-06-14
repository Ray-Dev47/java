
/*
Write a Java program to convert minutes into years and days.

Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days
*/
import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of minutes: "); 
        int num = scan.nextInt();
        int years = num / 525600;
        int day = num / 1440;
        int remMinutes = day % 525600;
        
        System.out.println( num + " minutes is approximately " +  years + " years and "  + remMinutes +  " days");
        scan.close();
    }
    
}
