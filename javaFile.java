/*
 Write a Java program to find a specified element in a given array of elements using Binary Search.
*/
import java.util.Arrays;
public class javaFile {

	public static void main(String[] args) {
		int numbers[] = {5, 6, 7, 8, 9, 10};
    int key = 8;

    int searchNum = Arrays.binarySearch(numbers, key);
    if(searchNum == -1){
       System.out.println("Not found");
    }else{
       System.out.println(searchNum); // 3
    }

	}
}





