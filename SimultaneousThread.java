/*
Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
*/


public class SimultaneousThread {
    public static void main(String args[]) {

        // This is the first block of code
      Thread thread = new Thread() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    if(i % 2 == 0){
                        System.out.println("Even Thead running: " + i);
                    }
                }
            }
        };

        // This is the second block of code
       Thread threadTwo = new Thread() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    if(i % 2 != 0){
                        System.out.println("Odd Thead running: " + i);
                    }
                }
            }
        };

        // These two statements are in the main method and begin the two
        // threads.
        // This is the third block of code
        thread.start();

        // This is the fourth block of code
        threadTwo.start();
    }
}



// Computer sample
// public class Find_Even_Odd_Number {
//   private static final int MAX_NUMBER = 20;
//   private static Object lock = new Object();
//   private static boolean isEvenTurn = true;

//   public static void main(String[] args) {
//     Thread evenThread = new Thread(() -> {
//       for (int i = 2; i <= MAX_NUMBER; i += 2) {
//         synchronized(lock) {
//           while (!isEvenTurn) {
//             try {
//               lock.wait();
//             } catch (InterruptedException e) {
//               e.printStackTrace();
//             }
//           }
//           System.out.println("Even Number from evenThread: " + i);
//           isEvenTurn = false;
//           lock.notify();
//         }
//       }
//     });

//     Thread oddThread = new Thread(() -> {
//       for (int i = 1; i <= MAX_NUMBER; i += 2) {
//         synchronized(lock) {
//           while (isEvenTurn) {
//             try {
//               lock.wait();
//             } catch (InterruptedException e) {
//               e.printStackTrace();
//             }
//           }
//           System.out.println("Odd Number from oddThread: " + i);
//           isEvenTurn = true;
//           lock.notify();
//         }
//       }
//     });

//     evenThread.start();
//     oddThread.start();
//   }
// }
