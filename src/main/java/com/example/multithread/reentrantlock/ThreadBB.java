package com.example.multithread.reentrantlock;

public class ThreadBB extends Thread {
    private MyService myService;

    public ThreadBB(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.functionB();
    }
}
