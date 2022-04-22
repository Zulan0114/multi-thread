package com.example.multithread.threadsafe;

public class ServiceThreadA extends Thread {
    private Service service;
    public ServiceThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.setUserNamePassword("a", "aa");
    }
}
