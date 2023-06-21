
/*
Write a Java program that displays the sum of n odd natural numbers.

Test Data
Input number of terms is: 5
Expected Output :

The odd numbers are :                                                            
1                                                                                
3                                                                                
5                                                                                
7                                                                                
9                                                                                
The Sum of odd Natural Number upto 5 terms is: 25
*/

import java.util.Scanner;

public class conditionalStatement {
    static int findOddSum(int n) {
        int sum = 0;
        for (int x = 1; x <= 2*n; x++)
        if(x % 2 != 0){
            sum = sum + x;
        }
        return sum;
           
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int nums = sc.nextInt();
        sc.close();
        for(int i = 1; i <= 2*nums; i++) {
            if(i % 2 != 0){
                System.out.println(i);
                
            }
        }
                int n = nums;
                System.out.println("The Sum of odd Natural Number upto 5 terms is: " + findOddSum(n));
    }
}
