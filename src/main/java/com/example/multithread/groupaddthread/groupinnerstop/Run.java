package com.example.multithread.groupaddthread.groupinnerstop;

public class Run {
    public static void main(String[] args) {
        try {
            ThreadGroup threadGroup = new ThreadGroup("my-thread-group");
            for (int i = 0; i < 5; i++) {
                MyThread myThread = new MyThread(threadGroup, "my-thread-" + (i+1));
                myThread.start();
            }
            Thread.sleep(5000);
            threadGroup.interrupt();
            System.out.println("call the interrupt() in main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
