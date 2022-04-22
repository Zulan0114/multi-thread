package com.example.multithread.threadexceptionmove;

public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("handle exception in thread group");
        e.printStackTrace();
    }
}
