package com.example.multithread.synchronizedupdatenewvalue;

public class RunThread extends Thread {
    private Service service;
    public RunThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.run();
    }
}
