
/*
Write a Java program to display the pattern like a right angle triangle with a number.

Test Data
Input number of rows : 10
Expected Output :

1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345                                                                            
123456                                                                           
1234567                                                                          
12345678                                                                         
123456789                                                                        
12345678910
*/

import java.util.Scanner;

public class conditionalStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        int i, j;
        int nums = sc.nextInt();
        sc.close();
        for(i=1;i<=nums;i++)
            {
            for(j=1;j<=i;j++)
            {
            System.out.print(j);
            }
            System.out.println("");
            }
        }
    }