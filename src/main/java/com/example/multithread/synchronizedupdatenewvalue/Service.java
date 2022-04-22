package com.example.multithread.synchronizedupdatenewvalue;

public class Service {
    private boolean isContinueRun = true;
    public void run() {
        while (isContinueRun) {
            System.out.println("running");
        }
        System.out.println("stopped");
    }
    public void stop() {
        isContinueRun = false;
    }
}
