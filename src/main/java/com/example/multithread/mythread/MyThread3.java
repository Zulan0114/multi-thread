package com.example.multithread.mythread;

public class MyThread3 extends Thread {
    private int i;
    public MyThread3(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(i);
    }
}
