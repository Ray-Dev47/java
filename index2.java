/*
Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.
Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
3 largest elements of the said array are:
100 25 17
 */


public class index2 {

         static void print3largest(int arr[], int arrSize) {
       int firstArr, secArr, thirdArr;

        if(arrSize < 3){
            System.out.println("Not up to 3");  // at least 3
            return;
        }

        thirdArr = firstArr = secArr = Integer.MIN_VALUE;
        for (int j = 0; j < arrSize; j++) {
              if(arr[j] > firstArr){
                  thirdArr = secArr;
                  secArr = firstArr;
                  firstArr = arr[j];
              }

              else if (arr[j] > secArr) {
                thirdArr = secArr;
                secArr = arr[j];
            }
 
            else if (arr[j] > thirdArr)
                thirdArr = arr[j];
        }
 
        System.out.println("Three largest elements are " + firstArr + " " + secArr + " " + thirdArr);
        }

        public static void main(String[] args)
        {
            int arr[] = { 1, 4, 17, 7, 25, 3, 100 };
            int n = arr.length;
            print3largest(arr, n);
        }

   
    }
 


