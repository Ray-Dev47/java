/*
 *  calculate the average value of array elements
 */

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] arr1 = { 1, 6, 3, 8, 4, 8, 9, 4 };

        System.out.println("Original Array: " + Arrays.toString(arr1));
        Arrays.sort(arr1);

        // Sum
        int sum = 0;
        for (int i : arr1)
            sum += i;
            System.out.println("Array sum" + sum);  // 43

        // count the digits
        int digitCount = 0;
        for (int i = 0; i < arr1.length; i++) {
             digitCount++;
        }
        System.out.println("count: " + digitCount);

        System.out.println("Average is: " + sum/digitCount );
    }
}
