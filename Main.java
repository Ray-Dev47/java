public class Main {
  public static void main(String args[]) {

    minMaxStack stk = new minMaxStack();

    stk.push(10);
    stk.push(20);
    stk.push(30);
    stk.push(50);
    stk.push(60);

    System.out.println("Minimum Element is:" + stk.getMin());

  }

}