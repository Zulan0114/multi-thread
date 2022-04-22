package com.example.multithread.threadsafe;

public class MyObject {
    // synchronized method lock object
    synchronized public void functionA() {
        try {
            System.out.println("begin functionA threadName = " + Thread.currentThread().getName() + ", begin time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end functionA threadName = " + Thread.currentThread().getName() + ", end time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void functionB() {
        try {
            System.out.println("begin functionB threadName = " + Thread.currentThread().getName() + ", begin time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end functionB threadName = " + Thread.currentThread().getName() + ", end time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
