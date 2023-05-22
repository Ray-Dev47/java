
/*
Write a Java program that iterates integers from 1 to 100. For multiples of three print "Fizz" instead of the number and print "Buzz" for five. When the number is divided by three and five, print "fizz buzz"
*/
    public class index {
    
        public static void main(String args[]) {

                for (int i = 0; i <= 100; i++) {
                    if(i % 3 == 0){
                        System.out.println(i +  " Fizz divisible by 3");
                    } else if(i % 5 == 0){
                        System.out.println( i + " Buzz divisible by 5");
                    } else if (i % 3 == 0 &&  i % 5 == 0 ){
                        System.out.println(i + " Fizz buxx divisible by 3 and 5");
                    }else{
                        System.out.println(i + " Other are not divisible");
                    }
                }
        }
    }
