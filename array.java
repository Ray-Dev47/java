/*
 * Write a Java program to find duplicate values in an array of string values.
 */


public class array {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 6, 1, 87, 87 };
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  

    }
}