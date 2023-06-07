/*
Write a Java program to print the contents of a two-dimensional Boolean array where t represents true and f represents false.

Sample array:
array = {{true, false, true},
{false, true, false}};
Expected Output :
t f t
f t f
 */


// public class index2 {
//     public static void main(String[] args) {
        
//         // boolean boolOne [][] = {{true, false, true},{false, true, false}};
//         int[][] boolOne = {{ 1, 2, 3 }, { 4, 5, 6 }};
//          for (int i = 0; i < boolOne.length; i++) {
//              for (int j = 0; j < boolOne[i].length; j++) {
//                 System.out.println( boolOne[i][j] + "  ");
//              }
//              System.out.println();
//          }        
//     }
// }

public class index2 {
    public static void main(String[] args) {
       final Boolean[][] matrix = {{true, false, true},{false, true, false}};
       for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
          for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
             if(matrix[i][j]){
                System.out.print(" t ");
             }else{
                System.out.print(" f ");
             }
          }
          System.out.println(); //change line on console as row comes to end in the matrix.
       }
    }
 }
