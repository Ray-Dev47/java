/*
Write a Java program to check if a file or directory has read and write permissions.
*/


import java.io.File;
// import java.util.Date;
public class javaFile {
       public static void main(String[] args) {   
        //   File file = new File("C:\\Users\\User\\Desktop");
          File myFile = new File("C:\\Users\\User\\Desktop\\DOM Terminologies.txt");
          if(myFile.canRead() && myFile.canWrite()){
             System.out.println(myFile.getAbsolutePath() +  " Yes, the file is writable and readable\n");
          } else{
             System.out.println("No read and write permissions");
          }
    }
}







