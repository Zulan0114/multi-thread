package com.example.multithread.state;

public class MyThread3 extends Thread {
    @Override
    public void run() {
        try {
            synchronized (MyLock.lock) {
                MyLock.lock.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
