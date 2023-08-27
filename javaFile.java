/*
Write a Java program to check if a file or directory specified by pathname exists or not.
*/


import java.io.File;
// import java.util.Date;
public class javaFile {
       public static void main(String[] args) {   
        //   File file = new File("C:\\Users\\User\\Desktop");
          File myFile = new File("C:\\Users\\User\\Desktop\\DOM Terminologies.txt");
          if(myFile.exists()){
             System.out.println("Yes, file exist\n");
          } else{
             System.out.println("Does not exist");
          }
         
    }
}







