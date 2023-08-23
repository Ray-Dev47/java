/*
Write a Java method to display the current date and time.

Expected Output:

Current date and time: Wednesday January 25, 2017 7:47:43
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

