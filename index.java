
/*
Write a Java program to reverse a linked list.
Example: For linked list 20->40->60->80, the reversed linked list is 80->60->40->20
*/


import java.util.LinkedList;
public class index {
    public static void main(String[] args) {
            LinkedList <Integer> nums = new LinkedList<Integer>();
            nums.add(20);  
            nums.add(40);  
            nums.add(60);  
            nums.add(80);  
            System.out.println(nums);

           nums = reversedNums(nums);
           System.out.println("Reversed nums: " + nums);
        }
        public static LinkedList<Integer> reversedNums(LinkedList<Integer>Llist){
            for (int i = 0; i < Llist.size() / 2; i++) {
                Integer temp = Llist.get(i);
                Llist.set(i, Llist.get(Llist.size() - i - 1));
                Llist.set(Llist.size() - i - 1, temp);
            }
     
            // Return the reversed arraylist
            return Llist;
        }
    }
    
    