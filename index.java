//   Write a Java program to display system time.
/*
 */
// import java.text.*;
import java.time.LocalDateTime;
// import java.util.*;
 
public class index {
    public static void main(String args[])
    {
        System.out.println(LocalDateTime.now());

        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
    }
}
 


