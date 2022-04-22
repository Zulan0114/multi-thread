package com.example.multithread.deadlock;

public class Run {
    public static void main(String[] args) {
        try {
            DeadThread deadThread = new DeadThread();
            deadThread.setUserName("a");
            Thread threadA = new Thread(deadThread);
            threadA.start();
            Thread.sleep(100);

            deadThread.setUserName("b");
            Thread threadB = new Thread(deadThread);
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
