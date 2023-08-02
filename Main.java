public class Main {
  public static void main(String[] args) {
      //  Person person1 = new Person("Raymond", 33, "Nigeria");
      //  System.out.println("Name: " + person1.getName() + " age: " + person1.getAge() + " Country: " + person1.getCountry());

      Person person2 = new Person();

      person2.setName("Emojaska");
      person2.setAge(26);
      person2.setCountry("Cuba");

      System.out.println("Name: " + person2.getName() + " age: " + person2.getAge() + " Country: " + person2.getCountry());

  }
}