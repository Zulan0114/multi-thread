package com.example.multithread.synchronizedupdatenewvalue;

public class Main {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            RunThread runThread = new RunThread(service);
            runThread.start();
            Thread.sleep(1000);
            StopThread stopThread = new StopThread(service);
            stopThread.start();
            System.out.println("sent the stop command out");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
