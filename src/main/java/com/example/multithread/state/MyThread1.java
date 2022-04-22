package com.example.multithread.state;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        MyService.service();
    }
}
