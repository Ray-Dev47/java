
/*
Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :
Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5                                                                                
The sum of 5 no is : 15                                                          
The Average is : 3.0   
*/

import java.util.Scanner;

public class conditionalStatement {
    static int findSum(int n) {
        int sum = 0;
        for (int x = 1; x <= n; x++)
            sum = sum + x;
        return sum;
    }
    // static int digit(int y){

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int nums = sc.nextInt();
        System.out.println("The first n natural numbers are:");
        for (int i = 1; i <= nums; i++) {
            System.out.println(i);
        }
        sc.close();

        int n = nums;
        System.out.println("The Sum of Natural Number up to n terms: " + findSum(n));
        int count = 0, temp;
 
        
        for (int i = 1; i <= nums; i++) {
            System.out.println(i);
            temp = i;
        while (temp != 0) {
            temp = temp / 10;
            ++count;
        }
        }
        
        System.out.println("Number of Digits: " + count);

        System.out.println("The Average is: " + findSum(n)/count);

    }

}
