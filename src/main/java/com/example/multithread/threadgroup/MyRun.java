package com.example.multithread.threadgroup;

public class MyRun {
    public static void main(String[] args) {
//        ThreadGroup threadGroup = new ThreadGroup("my-thread-group");
        MyThreadGroup threadGroup = new MyThreadGroup("my-thread-group");

        MyThread[] threadArray = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new MyThread(threadGroup, "thread" + (i + 1), "1");
            threadArray[i].start();
        }

        MyThread thread = new MyThread(threadGroup, "new-thread", "a");
        thread.start();
    }
}
