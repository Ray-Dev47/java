/*
Write a Java program to sort a given array list.
*/

// import java.util.List;
// import java.util.ArrayList;
// import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class javaFile {
  public static void main(String[] args)
  {
                 Set<String> colorSet = new TreeSet<String>();
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Orange");
        colorSet.add("Black");
        colorSet.add("Indigo");
        colorSet.add("Black");
        
        for(String n: colorSet){
           System.out.println(n);  //
        }


//         // method 2, we use sort
//          List<String> list_Strings = new ArrayList<String>();
//   list_Strings.add("Red");
//   list_Strings.add("Green");
//   list_Strings.add("Orange");
//   list_Strings.add("White");
//   list_Strings.add("Black");
//   System.out.println("List before sort: "+list_Strings);
//   Collections.sort(list_Strings);
//   System.out.println("List after sort: "+list_Strings);    
    }
 }





