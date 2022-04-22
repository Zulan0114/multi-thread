package com.example.multithread.joinexception;

public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        System.out.println("interrupt thread b");
        threadB.interrupt();
    }
}
