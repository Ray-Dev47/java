/*
Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.
*/


abstract class Animal{
    public abstract void eat();
    public abstract void sleep();
}

class Lion extends Animal{
    @Override
    public void eat(){
        System.out.println("Lion eats meat");
    } 

    @Override
    public void sleep(){
        System.out.println("Lion sleeps on floor or rocks");
    }
}
class Tiger extends Animal{
    @Override
    public void eat(){
        System.out.println("Tiger eats meats too");
    }

    @Override
    public void sleep(){
        System.out.println("Tiger sleeps on trees");
    }
}

class Deer extends Animal{
     @Override
    public void eat(){
        System.out.println("Deer eats plants");
    }
      @Override
    public void sleep(){
        System.out.println("Deer sleeps cautiously");
    }

    public static void main(String[] args){
        Animal eat1 = new Lion();
        Animal sleep1 = new Lion();
        Animal eat2 = new Tiger();
        Animal sleep2 = new Tiger();
        Animal eat3 = new Deer();
        Animal sleep3 = new Deer();

        eat1.eat();
        sleep1.sleep();
        eat2.eat();
        sleep2.sleep();
        eat3.eat();
        sleep3.sleep();
    }
}


