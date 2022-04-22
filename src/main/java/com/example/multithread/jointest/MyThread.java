package com.example.multithread.jointest;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            int secondValue = (int) (Math.random() * 10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
