package com.example.multithread.threadcommunication.waitnotify;

public class NotifyOneMain {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            WaitThread a = new WaitThread(lock);
            a.setName("A");
            a.start();
            WaitThread b = new WaitThread(lock);
            b.setName("B");
            b.start();
            WaitThread c = new WaitThread(lock);
            c.setName("C");
            c.start();

            Thread.sleep(1000);
//            NotifyThread notifyThread = new NotifyThread(lock);
//            notifyThread.start();
            NotifyAllThread notifyAllThread = new NotifyAllThread(lock);
            notifyAllThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
