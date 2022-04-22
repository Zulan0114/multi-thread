package com.example.multithread.groupaddthread;

public class Run {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        ThreadGroup threadGroup = new ThreadGroup("thread-group");
        Thread a = new Thread(threadGroup, threadA);
        a.setName("A");
        Thread b = new Thread(threadGroup, threadB);
        b.setName("B");
        a.start();
        b.start();
        System.out.println("active thread count: " + threadGroup.activeCount());
        System.out.println("thread group name: " + threadGroup.getName());
    }
}
