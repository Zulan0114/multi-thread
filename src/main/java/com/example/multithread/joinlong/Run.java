package com.example.multithread.joinlong;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
//            myThread.join(2000);
            Thread.sleep(2000);
            System.out.println("  end time:" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
