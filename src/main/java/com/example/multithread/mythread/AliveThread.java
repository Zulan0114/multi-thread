package com.example.multithread.mythread;

public class AliveThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("run---isAlive=" + this.isAlive());
    }
}
