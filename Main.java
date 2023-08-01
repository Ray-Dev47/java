
public class Main {
  public static void main(String[] args) {
    
       Flyable fly1 = new SpaceCraft();
       Flyable fly2 = new Airplane();
       Flyable fly3 = new Helicopter();

       fly1.fly_obj();
       fly2.fly_obj();
       fly3.fly_obj();
    }
}