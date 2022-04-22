package com.example.multithread.groupaddthread.threadrunsyn;

public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        MyThread a = new MyThread(lock, "A", 1);
        a.setName("MyThread-A");
        MyThread b = new MyThread(lock, "B", 2);
        b.setName("MyThread-B");
        MyThread c = new MyThread(lock, "C", 0);
        c.setName("MyThread-C");
        a.start();
        b.start();
        c.start();
    }
}
