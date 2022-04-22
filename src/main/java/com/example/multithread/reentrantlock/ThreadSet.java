package com.example.multithread.reentrantlock;

public class ThreadSet extends Thread {
    private MyService myService;

    public ThreadSet(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.set();
        }
    }
}
