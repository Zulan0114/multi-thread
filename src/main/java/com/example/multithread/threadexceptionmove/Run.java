package com.example.multithread.threadexceptionmove;

public class Run {
    public static void main(String[] args) {
//        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        MyThreadGroup threadGroup = new MyThreadGroup("my-thread-group");
//        MyThread myThread = new MyThread();
        MyThread myThread = new MyThread(threadGroup, "my-thread");
//        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        myThread.start();
    }
}
