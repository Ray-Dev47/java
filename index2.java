/*
Write a Java program to print an array after changing the rows and columns of a two-dimensional array.

Original Array:
10 20 30
40 50 60
After changing the rows and columns of the said array:10 40
20 50
30 60
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
            int arr[] = { 12, 13, 1, 10, 34, 1 };
            int n = arr.length;
            print3largest(arr, n);
        }

   
    }
 


