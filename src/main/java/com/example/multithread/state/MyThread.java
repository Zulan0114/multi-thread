package com.example.multithread.state;

public class MyThread extends Thread {
    public MyThread() {
        System.out.println("state in constructor: " + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("state in run: " + Thread.currentThread().getState());
        System.out.println("sleep begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sleep end");
    }
}
