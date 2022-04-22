package com.example.multithread.threadcommunication.waitnotify;

public class NotifyAllThread extends Thread {
    private final Object lock;

    public NotifyAllThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock) {
            System.out.println("thread name " + Thread.currentThread().getName() + " notify begin time=" + System.currentTimeMillis());
            lock.notifyAll();
            System.out.println("thread name " + Thread.currentThread().getName() + " notify end time=" + System.currentTimeMillis());
        }
    }
}
