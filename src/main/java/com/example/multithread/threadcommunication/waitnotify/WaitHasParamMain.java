package com.example.multithread.threadcommunication.waitnotify;

public class WaitHasParamMain {
    private static final Object lock = new Object();
    private static Runnable waitRunnable = new Runnable() {
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin time="+System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait end time="+System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    private static final Runnable notifyRunnable = new Runnable() {
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin time="+System.currentTimeMillis());
                lock.notify();
                System.out.println("notify end time="+System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) {
        Thread thread = new Thread(waitRunnable);
        thread.start();

        try {
            Thread.sleep(2000);
            Thread notifyThread = new Thread(notifyRunnable);
            notifyThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
