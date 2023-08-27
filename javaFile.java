/*
Write a Java program to get the file size in bytes, KB, MB.
*/


import java.io.File;


 public class javaFile {
  public static void main(String[] args)
  {
      File file = new File("C:\\Users\\User\\Desktop\\DOM Terminologies.txt");
      long bytes = file.length();

            // print the file size
            System.out.println(bytes + " bytes");
            System.out.println(bytes / 1024.0 + " kb");
            System.out.println(bytes / 1024000.0 + " MB");
  }
}






