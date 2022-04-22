package com.example.multithread.threadcommunication.waitnotify;

public class Main {
    public static void main(String[] args) {
        try {
//            String lock = "123";
////            lock.wait();
//            System.out.println("syn before");
//            synchronized (lock) {
//                System.out.println("syn enter");
//                lock.wait();
//                System.out.println("syn exit, under wait");
//            }
//            System.out.println("syn after");

            Object lock = new Object();
            WaitThread waitThread = new WaitThread(lock);
            waitThread.start();
            Thread.sleep(3000);
            NotifyThread notifyThread = new NotifyThread(lock);
            notifyThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
