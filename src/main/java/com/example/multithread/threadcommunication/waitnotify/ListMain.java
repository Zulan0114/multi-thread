package com.example.multithread.threadcommunication.waitnotify;

public class ListMain {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ListWaitThread a = new ListWaitThread(lock);
            a.start();
            Thread.sleep(50);
            ListNotifyThread b = new ListNotifyThread(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
