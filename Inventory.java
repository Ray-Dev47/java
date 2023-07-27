/*
Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.
*/

import java.util.ArrayList;

public class Inventory{
    private String name;
    private int quantity;
  
      public  Inventory(String name, int quantity){
            this.name = name;
            this.quantity = quantity;
      }

      public String getName(){
           return name;
      } 
      public void setName(String name){
          this.name = name;
      }

      public int getQty(){
          return quantity;
      }
      public void setQty(int quantity){
           this.quantity = quantity;
      }

      public class InvProudcts{
           private ArrayList <Inventory> products;
           
           public InvProudcts(){
                products = new ArrayList<Inventory>();
           }

           public void addProducts(Inventory product){
                 products.add(product);
           }

           public void removeProducts(Inventory product){
                 products.remove(product);
           }

           public ArrayList <Inventory> getProducts(){
                 return products;
           }

           public void checkLowInventory() {
            for (Inventory product: products) {
              if (product.getQty() <= 100) {
                System.out.println(product.getName() + " is running low on inventory. Current quantity: " + product.getQty());
              }
            }
          }

      }

      

      public static void main(String[] args){
          InvProudcts inv1 = new InvProudcts();
           Inventory product1 = new Inventory("Bread", 45);
           Inventory product2 = new Inventory("Yam", 45);


           inv1.addProducts(product1);
           inv1.addProducts(product2);

           inv1.checkLowInventory();
            System.out.println("\nRemove Tablet from the inventory!");
            inv1.removeProducts(product2);
            System.out.println("\nAgain check low inventory:"); 
            inv1.checkLowInventory();
  }
    }

