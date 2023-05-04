//  Write a Java program to print the following string in a specific format (see the output).
/*
 * Sample Output
 * 
 * Input number: 5                                                        
5 + 55  + 555


 */
import java.util.Scanner;

public class index{
    public static void main (String args[]) {
      int n;
    //   char str1, str2, str3;
      Scanner scan = new Scanner(System.in);
      System.out.println("Input number:  ");
      n = scan.nextInt();
      System.out.printf("%d + %d%d + %d%d%d\n", n,n,n,n,n,n);

      scan.close();
   
}
}
 


