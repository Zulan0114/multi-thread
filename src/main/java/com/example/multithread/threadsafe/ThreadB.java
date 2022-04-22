package com.example.multithread.threadsafe;

public class ThreadB extends Thread {
    private MyObject myObject;
    public ThreadB(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.functionB();
    }
}
