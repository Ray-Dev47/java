/*
 *Write a Java program to find the number of even and odd integers in a given array of integers
 */

// import java.util.Arrays;

// import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        int [] arr = {2,4,6,7,8,9,10,11};
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
        int diference = max - min;
        System.out.println("Difference is " + diference);
    }
}
