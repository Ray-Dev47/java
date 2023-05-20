
/*
Write a Java program to measure how long code executes in nanoseconds.
*/

// import java.io.*;

public class index {
	public static void main(String[] args) {
		 long startTime = System.nanoTime();
      
        // action to display first 10 natural numbers and then we will measure the time it takes to execute this 
        // int i;
        System.out.println("The first 10 ntural numbers are:\n:");
        for(int i = 1; i < 10; i++){
            System.out.println(i);
        }
         
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        System.out.println("Total time it takes to execute in nanoSeconds is: " + totalTime);
    }
}
 
