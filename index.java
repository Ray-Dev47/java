
/*
Write a Java program to take the last three characters from a given string. It will add the three characters at both the front and back of the string. String length must be greater than three and more. Go to the editor
Test data: "Python" will be "honPythonhon"
Sample Output:

honPythonhon
*/
// import java.util.Arrays;

class index {    
     public static void main(String[] args) {    
            //Initialize array     
           String str = "Python";
          String result = str.substring(3, 6); 
           System.out.println( result + str + result) ;
        }    
    }    
