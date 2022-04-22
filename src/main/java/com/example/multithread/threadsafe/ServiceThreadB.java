package com.example.multithread.threadsafe;

public class ServiceThreadB extends Thread {
    private Service service;
    public ServiceThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.setUserNamePassword("b", "bb");
    }
}
