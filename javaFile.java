/*
Write a Java program to determine the last modified date of a file.
*/


// import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
// import java.util.Date;
public class javaFile {
       public static void main(String[] args) {   
        //   File file = new File("C:\\Users\\User\\Desktop\\DOM Terminologies.txt");
        //   File myFile = new File("C:\\Users\\User\\Desktop\\DOM Terminologies.txt");
         
        //      System.out.println(  myFile.lastModified());  // Yes, it is a directory
           String fileName = "C:\\\\Users\\\\User\\\\Desktop\\\\DOM Terminologies.txt";

        try {

            Path file = Paths.get(fileName);
            BasicFileAttributes attr =
                Files.readAttributes(file, BasicFileAttributes.class);

            System.out.println("creationTime: " + attr.creationTime());
            System.out.println("lastAccessTime: " + attr.lastAccessTime());
            System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







