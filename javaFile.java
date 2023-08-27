/*
Write a Java program to check if the given pathname is a directory or a file.
*/


import java.io.File;
// import java.util.Date;
public class javaFile {
       public static void main(String[] args) {   
        //   File file = new File("C:\\Users\\User\\Desktop\\Desktop\\DOM Terminologies.txt");
          File myFile = new File("C:\\Users\\User");
          if(myFile.isDirectory()){
             System.out.println( " Yes, it is a directory");  // Yes, it is a directory
          } else{
             System.out.println("No it is a file");
          }
    }
}







