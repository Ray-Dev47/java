public class Main {
  public static void main(String[] args) {
      // Vehicle vehicle = new Vehicle();
      Vehicle car = new Car();
      Vehicle bicycle = new Bicycle();


      System.out.println("Car initial speed: " + car.getSpeed());
        System.out.println("Motorcycle initial speed: " + bicycle.getSpeed());
        car.speedUp();
        bicycle.speedUp();
        System.out.println("\nCar speed after speeding up: " + car.getSpeed());
        System.out.println("bicycle speed after speeding up: " + bicycle.getSpeed());
  }
}