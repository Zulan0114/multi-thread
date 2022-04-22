package com.example.multithread.threadcommunication.producerconsumer;

public class ThreadC extends Thread {
    private C c;
    public ThreadC(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            c.popService();
        }
    }
}
