/*
Write a Java method to count all the words in a string.
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:

Number of words in the string: 9
*/

import java.util.Scanner;
public class javaMethods {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        in.close();

        System.out.print("Word count: " + count_words(str)+"\n");
    }

    public static int count_words(String str){
        int count = 0;
        char ch[]= new char[str.length()];     
            for(int i=0;i<str.length();i++)  
            {  
                ch[i]= str.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++; 
            }  
            return count;  
    }

}


