/*
Write a Java program to increase an array list size.
*/

// import java.util.List;
import java.util.ArrayList;
// import java.util.Collections;


public class javaFile {
  public static void main(String[] args)
  {
        ArrayList<String> colorSet = new ArrayList<String>();
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Orange");
        colorSet.add("Black");
        colorSet.add("Indigo");
        colorSet.add("Black");
        
        System.out.println("original Array " + colorSet);
        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
      colorSet.ensureCapacity(15);
      colorSet.add("Gray");
      colorSet.add("White");
      System.out.println("Array after " + colorSet);
    }
 }





