//  Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
/*
 */
public class index {

	public static void main(String args[]) {
        System.out.println("\n Divided by 3");
        for (int i = 0; i < 100; i++){
             if(i % 3 == 0){
                //  System.out.print(i + " ");
                System.out.print(i + ", ");
             } 

            }

            System.out.println("\n\nDivided by 5");
            for(int i = 0; i < 100; i++){
                  if(i % 5 == 0){
                    System.out.print(i + ", ");
                  }                    
            }

            System.out.println("\n\nDivided by 5 & 3");
            for(int i = 0; i < 100; i++){
                  if(i % 3 == 0  &&  i % 5 == 0){
                    System.out.print(i + ", ");
                  }                    
            }
        }
        
       
}



