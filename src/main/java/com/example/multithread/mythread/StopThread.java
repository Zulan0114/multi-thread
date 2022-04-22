package com.example.multithread.mythread;

public class StopThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run---begin");
            for (int i = 0; i < 500000; i++) {
                if (this.isInterrupted()) {
                    throw new InterruptedException("interrupted");
                }
                System.out.println("i = " + i);
            }
            System.out.println("run---end");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
