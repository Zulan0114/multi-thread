package com.example.multithread.volatiletest;

public class MyThread extends Thread {
    // volatile解决的是变量在多个线程之间的可见性,不保证原子性
    // synchronized解决的是多个线程之间访问资源的同步性
    // 线程安全包含原子性和可见性两个方面
    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("enter run()");
        while (isRunning) {
            System.out.println("running");

        }
        System.out.println("exit run()");
    }
}
