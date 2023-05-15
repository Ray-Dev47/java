
/*
 Write a Java program to multiply the corresponding elements of two integer arrays. Go to the editor
Sample Output:

Array1: [1, 3, -5, 4]                                                                                                                    
Array2: [1, 4, -5, -2]                                                                                                                       
Result: 1 12 25 -8 // ans 
 */

// import java.util.Arrays;

class index {    
     public static void main(String[] args) {    
            //Initialize array     
           int[] arr1 = {1, 3, -5, 4};
           int[] arr2 = {1, 4, -5, -2};
           
           String result = " ";

           for (int i = 0; i < arr1.length; i++) {
                result += Integer.toString(arr1[i] * arr2[i]) + " , " ;            
           }
           System.out.println(result );
        }    
    }    
