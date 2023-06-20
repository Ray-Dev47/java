/*
 *  Write a Java program to sum values of an array.
 */

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr1 = { 1, 6, 3, 8, 4, 8, 9, 4 };

        System.out.println("Original Array: " + Arrays.toString(arr1));
        Arrays.sort(arr1);

        // System.out.println("Sum of arrays: " + Arrays.toString(arr1));

        int sum = 0;

        for (int i : arr1)
            sum += i;
            System.out.println(sum);  // 43
    }

}
