package com.example.multithread.volatiletest;

public class VolatileRun {
    public static void main(String[] args) {
//        PrintStringService printStringService = new PrintStringService();
////        printStringService.printString();
//        new Thread(printStringService).start();
//        System.out.println("try to stop print, stop thread name=" + Thread.currentThread().getName());
//        printStringService.setContinuePrint(false);

        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.setRunning(false);
            System.out.println("set isRunning with false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
