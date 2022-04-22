package com.example.multithread.threadgroup;

public class MyThread extends Thread {
    private String num;

    public MyThread(ThreadGroup threadGroup, String name, String num) {
        super(threadGroup, name);
        this.num = num;
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
//        while (true) {
        while (!this.isInterrupted()) {
            System.out.println("dead loop: " + Thread.currentThread().getName());
        }
    }
}
