/*
 *Write a Java program to find the number of even and odd integers in a given array of integers
 */

// import java.util.Arrays;

// import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        int [] arr = {1,2,4,6,7,8,9,10,11};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                evenCount++;
            }
        }
        System.out.println("Total even number is " + evenCount);
        for (int i = 0; i < arr.length; i++) {
             if(i % 2 != 0){
                oddCount++;
             }
        }
         System.out.println("Total odd number is " + oddCount);
    }
}
