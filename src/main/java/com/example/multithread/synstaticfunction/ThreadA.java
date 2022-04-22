package com.example.multithread.synstaticfunction;

public class ThreadA extends Thread {
    @Override
    public void run() {
        super.run();
        StaticService.printA();
    }
}
