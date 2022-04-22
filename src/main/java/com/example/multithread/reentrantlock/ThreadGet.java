package com.example.multithread.reentrantlock;

public class ThreadGet extends Thread {
    private MyService myService;

    public ThreadGet(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.get();
        }
    }
}
