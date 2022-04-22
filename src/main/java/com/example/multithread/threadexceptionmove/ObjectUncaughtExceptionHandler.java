package com.example.multithread.threadexceptionmove;

public class ObjectUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("handle exception in object");
        e.printStackTrace();
    }
}
