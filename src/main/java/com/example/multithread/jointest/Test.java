package com.example.multithread.jointest;

public class Test {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join();
            System.out.println("after join");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
