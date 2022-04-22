package com.example.multithread.threadsafe;

public class ServiceRun {
    public static void main(String[] args) {
        Service service = new Service();
        ServiceThreadA serviceThreadA = new ServiceThreadA(service);
        serviceThreadA.setName("A");
        serviceThreadA.start();
        ServiceThreadB serviceThreadB = new ServiceThreadB(service);
        serviceThreadB.setName("B");
        serviceThreadB.start();
    }
}
