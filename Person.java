/*
Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.
 */


public class Person {
    private double accountNumber;
    private double balance;

    public double getAccNum(){
        return accountNumber;
    }
    public void setAccNum(double accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

}

