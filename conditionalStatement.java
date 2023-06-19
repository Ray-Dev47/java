
/*
 Write a Java program to display the cube of the given number up to an integer.

Test Data
Input number of terms : 4
Expected Output :

Number is : 1 and cube of 1 is : 1                                               
Number is : 2 and cube of 2 is : 8                                               
Number is : 3 and cube of 3 is : 27                                              
Number is : 4 and cube of 4 is : 64
*/

import java.util.Scanner;

public class conditionalStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int nums = sc.nextInt();
        sc.close();
        System.out.println("Number is: " + nums +  " and cube of " + nums +  " is " + cube(nums));
    }
    public static int cube(int x){
        return x * x * x;
    }

}
