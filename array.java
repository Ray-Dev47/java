/*
 * Write a Java program to find common elements between two integer arrays.
 */

// import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 7, 32, 7, 9, 4, 7, 2, 4, 9, 87, 1 };
        int current = arr[0];
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (current == arr[i] && !found) {
                found = true;
            } else if (current != arr[i]) {
                System.out.print(" " + current);
                current = arr[i];
                found = false;
            }
        }
        System.out.print(" " + current);  // 3 4 5 7 32 7 9 4 7 2 4 9 87 1
    }
}
