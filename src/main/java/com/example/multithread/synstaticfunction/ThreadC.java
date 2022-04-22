package com.example.multithread.synstaticfunction;

public class ThreadC extends Thread {
    private StaticService service;
    public ThreadC(StaticService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printC();
    }
}
