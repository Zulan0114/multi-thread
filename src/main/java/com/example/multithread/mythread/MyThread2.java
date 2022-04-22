package com.example.multithread.mythread;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run = " + Thread.currentThread().getId() + ", " + Thread.currentThread().getName() + ", " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
