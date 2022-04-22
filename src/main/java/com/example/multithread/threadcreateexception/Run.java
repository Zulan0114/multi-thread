package com.example.multithread.threadcreateexception;

public class Run {
    public static void main(String[] args) {
        MyThread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("thread: " + t.getName() + ", exception: " + e.getMessage());
                e.printStackTrace();
            }
        });

        MyThread thread = new MyThread();
        thread.setName("A");
//        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println("thread: " + t.getName() + ", exception: " + e.getMessage());
//                e.printStackTrace();
//            }
//        });
        thread.start();
        MyThread myThread = new MyThread();
        myThread.setName("B");
        myThread.start();
    }
}
