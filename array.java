/*
 * Write a Java program to find the second smallest element in an array.
 */

// import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
        // int i, j;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < i-1; j++) {
                if (arr[j] > arr[j+1])  
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(arr[1]);  // 1
    }
}
