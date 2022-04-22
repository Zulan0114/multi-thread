package com.example.multithread.mythread;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(this.getClass().getSimpleName());
    }
}
