/*
 * Write a Java program to find the maximum and minimum value of an array.
 */

// import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int [] arr = {7,5,7,8,4,3}; 
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
        

        System.out.println("smallest element of the said array: " + min);
        System.out.println("largest element of the said array: " + max);
    }
}


/*
 * import java.util.Arrays; 
public class Exercise9 {
 
public static void main(String[] args) {

   int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

    // Insert an element in 3rd position of the array (index->2, value->5)
   
   int Index_position = 2;
   int newValue    = 5;

  System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  for(int i=my_array.length-1; i > Index_position; i--){
    my_array[i] = my_array[i-1];
   }
   my_array[Index_position] = newValue;
   System.out.println("New Array: "+Arrays.toString(my_array));
 }
 }
 
 */