package com.example.multithread.threadexceptionmove;

public class MyThread extends Thread {
    private String num = "a";

    public MyThread() {
        super();
    }

    public MyThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        System.out.println("print " + (numInt + 1));
    }
}
