package com.example.multithread.reentrantlock;

public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
//        myService.functionA();
//        myService.awaitFunction();
        myService.awaitA();
    }
}
