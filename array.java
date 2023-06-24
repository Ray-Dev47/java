/*
 * Write a Java program to check if an array of integers contains two specified elements 65 and 77.
 */

// import java.util.Arrays;


public class array {
    public static void main(String[] args) {
        int [] arr = {2,4,6,7,8,9,10,11, -1, 77};
        int num1 = 65;
        int num2 = 77;
        boolean isContain = true;
         for (int x : arr) {
                // System.out.println(x);
                if(x == num1 || x == num2){
                    isContain = false;
                    break;
                }
            }
        if(isContain == false){
            System.out.println("Array contains either 66 or 77");
        } 
        else{
            System.out.println("Array does not contains 66 and 77");
        }
    }
}
