package com.example.multithread.synstaticfunction;

public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        StaticService.printB();
    }
}
