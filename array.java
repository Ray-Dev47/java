/*
 * Write a Java program to find common elements between two integer arrays.
 */

public class array {

    public static void main(String[] args) {
        int [] arr = { 3,4,5,7,32,7,9 };
       int [] arr2 = { 4,7,2,4,9,87,1 };
        System.out.println("");

        int common;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    common = arr[i];
                    System.out.println(common);
                }
            }

        }
    }
}

// var common = []; // Array to contain common elements
// for(var i=0 ; i<arr1.length ; ++i) {
// for(var j=0 ; j<arr2.length ; ++j) {
// if(arr1[i] == arr2[j]) { // If element is in both the arrays
// common.push(arr1[i]); // Push to common array
// }
// }
// }

// return common;