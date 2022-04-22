package com.example.multithread.threadcommunication.waitnotify;

public class WaitInterruptMain {
    public static void main(String[] args){
        try {
            Object lock = new Object();
            WaitThread a = new WaitThread(lock);
            a.start();
            Thread.sleep(5000);
            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
