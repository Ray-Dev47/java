/*
 Write a Java program to empty an array list.

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
        
       

        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
        int colorSize = colorSet.size();
        System.out.println("init number size " + colorSize); // 6
        colorSet.removeAll(colorSet);

        int colorSizeAfter = colorSet.size();
        System.out.println("final number size " + colorSizeAfter); // 0
        System.out.println(colorSet);  // []
       
        // System.out.println(colorSet2);

    }
 }





