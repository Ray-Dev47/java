/*
 Write a Java program for trimming the capacity of an array list.
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

      System.out.println("Before trim to size" + colorSet);
        colorSet.trimToSize();
        System.out.println("after trim to size" + colorSet);
        
        // System.out.println(colorSet2);
        for (String number : colorSet) {
            System.out.println("Number  " + number);
         }

    }
 }





