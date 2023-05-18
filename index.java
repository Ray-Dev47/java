
/*
Write a Java program to count the number of even and odd elements in a given array of integers.
*/

public class index {
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6,7,8,9,11,10,20};
        int odd = 0;
        int even = 0;
        
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] % 2 == 0){
                even++;
            } 
            else{
                odd++;
            }           
        }
        System.out.println("Total even numbers is: " + even);
        System.out.println("Total odd numbers is: " + odd);
    }
}
 
