/*
Write a Java program to get the first and last elements in a tree set.
*/

// import java.util.Set;
import java.util.TreeSet;

public class javaFile {
  public static void main(String[] args)
  {
    
       TreeSet<String> colorSet = new TreeSet<String>();
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Orange");
        colorSet.add("Black");
        colorSet.add("Indigo");
        colorSet.add("Black");
                

        System.out.println("TreeSet first and last: " + colorSet.first());
        System.out.println("TreeSet first and last: " + colorSet.last());
  
       
        

        // for(String n: colorSet){
        //    System.out.println(n);  //
        // }
    }
 }





