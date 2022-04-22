package com.example.multithread.threadexceptionmove;

public class StateUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("handle exception in state");
        e.printStackTrace();
    }
}
