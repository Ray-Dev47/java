/*
 Write a Java program to clone an array list to another array list.
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
        
        // ArrayList<String> colorSet2 = new ArrayList<String>();
       

        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
        ArrayList<String>  colorSet2 = (ArrayList<String>) colorSet.clone();
       
        System.out.println(colorSet2);

    }
 }





