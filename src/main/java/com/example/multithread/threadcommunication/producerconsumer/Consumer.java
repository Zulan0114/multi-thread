package com.example.multithread.threadcommunication.producerconsumer;

public class Consumer {
    private String lock;

    public Consumer(String lock) {
        this.lock = lock;
    }

    public void consumeValue() {
        try {
            synchronized (lock) {
                if ("".equals(ValueObject.value)) {
                    lock.wait();
                }
                System.out.println("value " + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
