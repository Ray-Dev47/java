/*
Write a Java program that finds numbers greater than the average of an array.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
The average of the said array is: 22.0
The numbers in the said array that are greater than the average are:
25
100
 */



public class index2{
    // Driver code
	public static void main(String[] args)
	{
			double[] arr = {1, 4, 17, 7, 25, 3, 100};
            
            double sum = 0;
         
            //compute sum
            int i=0;
            while(i < arr.length) {
                sum += arr[i];
                i++;
            }
             
            //compute average
            double average = (sum / arr.length); 
            System.out.println( "The average of the said array is: "+  average);

            for (int j = 0; j < arr.length; j++) {
                if(average < arr[j]){
                    System.out.println("arrays greater than the average: " +  arr[j]);
                }
            }
	}
	
   

}




