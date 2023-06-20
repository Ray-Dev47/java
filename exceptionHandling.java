
    /*
Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
*/

import java.util.Scanner;
public class exceptionHandling {
    // int nums;
    // public int even(int x){
    //     if(nums % 2 != 0){
    //         return x;
    //     }
    //     return x;
    // }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input an integer");
            int nums1 = sc.nextInt();
            sc.close();
            if(nums1 % 2 == 0){
                System.out.println("Even num entered is " + nums1);
            } else{
                throw new Exception();
         }
            
        } catch (Exception e) {
            System.out.println("odd number entered" + e);   // Something went wrong.
        }
        
    }
}

