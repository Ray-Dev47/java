
/*
Write a Java program to display n terms of natural numbers and their sum.

Test Data
Input the number: 2
Expected Output :

Input number:                                                                    
2                                                                                
The first n natural numbers are :                                                
2                                                                                
1                                                                                
2                                                                                
The Sum of Natural Number upto n terms :                                         
23
*/

import java.util.Scanner;

public class conditionalStatement {
    static int findSum(int n) {
        int sum = 0;
        for (int x = 1; x <= n; x++)
            sum = sum + x;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int nums = sc.nextInt();
        System.out.println("The first n natural numbers are:");
        for (int i = 1; i <= nums; i++) {
            System.out.println(i);
        }

        int n = nums;
        System.out.println("The Sum of Natural Number up to n terms: " + findSum(n));

        sc.close();
    }

}
