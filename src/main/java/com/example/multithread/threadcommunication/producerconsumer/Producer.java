package com.example.multithread.threadcommunication.producerconsumer;

public class Producer {
    private final String lock;

    public Producer(String lock) {
        this.lock = lock;
    }

    public void produceValue() {
        try {
            synchronized (lock) {
                if (!"".equals(ValueObject.value)) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set value with " + value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
