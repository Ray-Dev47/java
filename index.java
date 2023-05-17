
/*
Write a Java program to get the value of environment variables PATH, TEMP, USERNAME.
*/

// import java.io.*;

public class index {
	public static void main(String[] args) {
		
          System.out.println("Get envronment variables path: ");
          System.out.println(System.getenv("PATH"));  //

          System.out.println("Get envronment variables Temp: ");
          System.out.println(System.getenv("TEMP"));  //

          System.out.println("Get envronment variables Username: ");
          System.out.println(System.getenv("USERNAME"));  //

    }
}
 
