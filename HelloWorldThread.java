/*
In computer science, a thread of execution is the smallest sequence of programmed instructions that can be managed independently by a scheduler, which is typically a part of the operating system. The implementation of threads and processes differs between operating systems.

A thread is a thread of execution in a program. The Java Virtual Machine allows an application to have multiple threads of execution running concurrently.

Every thread has a priority. Threads with higher priority are executed in preference to threads with lower priority. Each thread may or may not also be marked as a daemon. When code running in some thread creates a new Thread object, the new thread has its priority initially set equal to the priority of the creating thread, and is a daemon thread if and only if the creating thread is a daemon.


Task 1- Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
*/


public class HelloWorldThread extends Thread{

    public void run(){
        System.out.println("Hello World running on a thread");
    }
    public static void main(String[] args){
          HelloWorldThread obj1 = new HelloWorldThread();
          obj1.start();
    }
}


