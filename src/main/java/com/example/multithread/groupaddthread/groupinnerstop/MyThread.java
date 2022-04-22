package com.example.multithread.groupaddthread.groupinnerstop;

public class MyThread extends Thread {
    public MyThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        System.out.println("thread name: " + Thread.currentThread().getName() + " is ready to start a dead end cycle.");
        while (!this.isInterrupted()) {

        }
        System.out.println("thread name: " + Thread.currentThread().getName() + " is end.");
    }
}
