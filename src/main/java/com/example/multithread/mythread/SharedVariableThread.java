package com.example.multithread.mythread;

public class SharedVariableThread extends Thread {
    private int count;

    public SharedVariableThread(int count) {
        super();
        this.count = count;
    }

    @Override
    synchronized public void run() {
        super.run();
        if (count > 0) {
            System.out.println(Thread.currentThread().getName() + " count = " + count--);
        } else {
            System.out.println(Thread.currentThread().getName() + " count <= 0");
        }
    }
}
