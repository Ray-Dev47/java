/*
 * Write a Java program to find duplicate values in an array of string values.
 */

public class array {

    public static void main(String[] args) {
        String[] arr = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
        String[] arr2 = { "C", "Xamarin", "Flutter", "Java", "C++", "GO" };
        System.out.println("");

        String common;
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