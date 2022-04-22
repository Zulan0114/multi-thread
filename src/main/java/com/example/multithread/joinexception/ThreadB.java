package com.example.multithread.joinexception;

public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("end of thread b");
        } catch (InterruptedException e) {
            System.out.println("catch exception of thread b");
            e.printStackTrace();
        }
    }
}
