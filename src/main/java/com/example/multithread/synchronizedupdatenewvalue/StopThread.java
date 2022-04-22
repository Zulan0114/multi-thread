package com.example.multithread.synchronizedupdatenewvalue;

public class StopThread extends Thread {
    private Service service;
    public StopThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.stop();
    }
}
