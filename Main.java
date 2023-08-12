public class Main {
  public static void main(String[] args) {
       Car car = new Car();
       car.setCompanyName("Toyota");
       car.setModelName("Camry");
       car.setYear(2009);
       
       System.out.println("Company name : " + car.getCompanyName() + " modelname: " + car.getModelName() + " year: " + car.getMileage());
  }
}