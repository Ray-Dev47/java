//  Write a Java program and compute the sum of the digits of an integer

// import java.util.Scanner;

// public class index {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please enter first integer");
//         int first = sc.nextInt();
//         System.out.println("Please enter second integer");
//         int second = sc.nextInt();
//         sc.close();

//         System.out.println("The sum of two integers are: " + sum(first, second));
//     }

//     public static int sum(int a,int b){
//         return a + b;
//     }
// }
//  xxxxxxxxxxxxxxxxxxxxxxxxxxx wrong understanding, the idea is to add the two integers separately


// Correction - 
import java.util.Scanner;

public class index{

    public static void main(String args[]){
        int num, input, sum = 0;
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Please enter integer");
         
         num = scan.nextInt();

         while(num != 0){
            input = num % 10;
            sum += input;
            num = num / 10; 
         }
         scan.close();
         System.out.println("\nSum of Digits = " + sum);
    }
}