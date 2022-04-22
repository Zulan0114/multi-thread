package com.example.multithread.threadcommunication.waitnotify;

public class WaitThread extends Thread {
    private final Object lock;

    public WaitThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock) {
                System.out.println("thread name " + Thread.currentThread().getName() + " wait begin time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("thread name " + Thread.currentThread().getName() + " wait end time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            System.out.println("exception happened for interrupting thread in waiting status");
            e.printStackTrace();
        }
    }
}
