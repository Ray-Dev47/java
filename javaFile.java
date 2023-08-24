/*
Write a Java program to get a list of all file/directory names in the given directory.

*/


import java.io.File;
// import java.util.Date;
public class javaFile {
       public static void main(String[] args) {   
          File file = new File("/home/career/");
          String[] fileList = file.list();
          for(String name:fileList){
             System.out.println(name);
          }
    }
}







