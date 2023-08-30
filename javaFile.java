/*
Write a Java program to read the contents of a file into a byte array.
*/

// import java.io.File;
// import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


 public class javaFile {
  public static void main(String[] args)
  {
    //   File file = new File("C:\\Users\\User\\Desktop\\DOM Terminologies.txt");
    //   long bytes = file.length();
    String file_name = "C:\\Users\\User\\Desktop\\DOM Terminologies.txt";
    InputStream fins = null;
        try {
            fins = new FileInputStream(file_name);
            byte file_content[] = new byte[2*1024];
            int read_count = 0;
            while((read_count = fins.read(file_content)) > 0){
                System.out.println(new String(file_content, 0, read_count-1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fins != null) fins.close();
            } catch(Exception ex){
                 
            }
        }
          
    }
 }





