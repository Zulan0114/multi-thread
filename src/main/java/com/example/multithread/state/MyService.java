package com.example.multithread.state;

public class MyService {
    synchronized public static void service() {
        try {
            System.out.println(Thread.currentThread().getName() + " enter service");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
