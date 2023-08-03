public class Main {
  public static void main(String[] args) {
       Animal animal = new Animal();
       Animal bird = new Bird();
       Animal cat = new Cat();

       bird.sound();
       cat.sound();
       animal.sound();  
  }
}