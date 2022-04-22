package com.example.multithread.threadcommunication.waitnotify;

public class NotifyThread extends Thread {
    private final Object lock;

    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock) {
            System.out.println("thread name " + Thread.currentThread().getName() + " notify begin time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("thread name " + Thread.currentThread().getName() + " notify end time=" + System.currentTimeMillis());
        }
    }
}
