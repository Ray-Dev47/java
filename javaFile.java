/*
 Write a Java program to test whether an array list is empty or not.
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
        if(colorSet.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty");
        }
        System.out.println(colorSet);  // []
       
        // System.out.println(colorSet2);

    }
 }





