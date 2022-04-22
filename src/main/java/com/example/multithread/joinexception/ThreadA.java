package com.example.multithread.joinexception;

public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = String.valueOf(Math.random());
        }
    }
}
