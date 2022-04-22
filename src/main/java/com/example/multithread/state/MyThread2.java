package com.example.multithread.state;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        MyService.service();
    }
}
