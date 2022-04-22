package com.example.multithread.mythread;

public class MyThread4 extends Thread {

    public MyThread4() {
        System.out.println("constructor name: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run name: " + Thread.currentThread().getName());
    }
}
