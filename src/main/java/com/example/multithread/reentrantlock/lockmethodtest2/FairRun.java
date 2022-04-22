package com.example.multithread.reentrantlock.lockmethodtest2;

public class FairRun {
    public static void main(String[] args) {
        final FairService service = new FairService(true);
        Runnable runnable = new Runnable() {
            public void run() {
                service.serviceFunction();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        final FairService service1 = new FairService(false);
        runnable = new Runnable() {
            public void run() {
                service1.serviceFunction();
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
