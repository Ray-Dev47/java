/*
Write a Java method to display the current date and time.

Expected Output:

Current date and time: Wednesday January 25, 2017 7:47:43
*/


import java.util.Random;
public class javaNumbers {
       public static void main(String[] args) {   
           Random random = new Random();
           int min = 1;
           int max = 10;

           int ans = random.nextInt(max + min) + min;
           System.out.println(ans);
    }
}

