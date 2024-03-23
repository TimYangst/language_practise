package thread_demo;

import java.lang.Thread;

class MultithreadingDemo extends Thread {

    public void run() {
        try {
            System.out.println(String.format("Thread %s is running.", Thread.currentThread().getName()));
        } catch (Exception e) {
            System.out.println("Exception is caught: " + e.getMessage());
        }
    }
}

public class Multithread {
    public static void main(String[] args) {
        int  n = 8;
        for (int i = 0; i< n; i++) {
            MultithreadingDemo demo = new MultithreadingDemo();
            demo.start();
        }
        System.out.println("Main thread end.");
    }
}