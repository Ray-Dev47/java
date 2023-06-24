/*
 * Write a Java program to compute the average value of an array of integers except the largest and smallest values.
 */

// import java.util.Arrays;


public class array {

    public static void main(String[] args) {
        int [] arr = {2,4,6,7,8,9,10,11};
        if(arr.length < 1){
            return;
        }
         int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int exclusiveCount = 0;
        int sum = 0;
         for (int i : arr){
               
               if(i != max && i != min){
                exclusiveCount++;
                sum += i;
                // System.out.println("Remaining array " + i);
            }
         }
         System.out.println("Array sum " + sum);  
         System.out.println("remaining: " + exclusiveCount);
         System.out.println("Average is " + sum/exclusiveCount);
    }
}
