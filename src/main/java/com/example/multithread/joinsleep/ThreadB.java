package com.example.multithread.joinsleep;

public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
//            System.out.println("thread b begin time:" + System.currentTimeMillis());
//            Thread.sleep(5000);
//            System.out.println("thread b   end time:" + System.currentTimeMillis());

            System.out.println("begin B threadName:" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  end B threadName:" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void bService() {
        System.out.println("bService time:" + System.currentTimeMillis());
    }
}
