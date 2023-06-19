
/*
Write a Java program that reads an integer and check whether it is negative, zero, or positive.

Test Data
Input a number: 7
Expected Output :

Number is positive
*/

import java.util.Scanner;

public class conditionalStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int nums = sc.nextInt();
        sc.close();
           if(nums > 0){
            System.out.println("Number is positive");
           } else if(nums == 0){
             System.out.println("Number is zero");
           } else{
            System.out.println("number is Negative");
           }
        }
    }