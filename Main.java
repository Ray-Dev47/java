public class Main {
  public static void main(String[] args) {
     Person person1 = new Person();

     person1.setAccNum(30.56);
     person1.setBalance(45.66);

     System.out.println("Account number: " + person1.getAccNum() + " balance: " + person1.getBalance());

  }
}