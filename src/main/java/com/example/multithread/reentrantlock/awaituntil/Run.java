package com.example.multithread.reentrantlock.awaituntil;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            public void run() {
                service.waitMethod();
            }
        };
        Runnable runnable1 = new Runnable() {
            public void run() {
                service.notifyMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread.sleep(2000);
        Thread threadB = new Thread(runnable1);
        threadB.start();
    }
}
