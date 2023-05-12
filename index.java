
/*
Write a Java program to get the largest value between the first and last elements of an array (length 3) of integers. Go to the editor
Sample Output:

Original Array: [20, 30, 40]                                           
Larger value between first and last element: 40 
 */

 class index {    
     public static void main(String[] args) {    
            //Initialize array     
            int [] arr =  {20, 30, 40};     
            
            int max = arr[0];

            for(int i = 0; i < arr.length; i++){
               if(arr[i] > max){
                    max = arr[i];
               }
            }
            System.out.println("Max element in the array is: " + max);
        }    
    }    
