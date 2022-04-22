package com.example.multithread.daemonthread;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("End of main and the thread don't print anymore.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
