package com.example.multithread.threadsafe;

public class ThreadA extends Thread {
    private MyObject myObject;
    public ThreadA(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.functionA();
    }
}
