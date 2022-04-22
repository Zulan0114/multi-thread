package com.example.multithread.reentrantlock;

public class FairRun {
    public static void main(String[] args) {
        final FairService service = new FairService(false);
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("★ThreadName:" + Thread.currentThread().getName() + " run");
                service.serviceFunction();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
