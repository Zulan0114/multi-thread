package com.example.multithread.priority;

public class CountThread extends Thread {
    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            count++;
        }
    }
}
