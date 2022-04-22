package com.example.multithread.volatiletest;

public class CountRun {
    public static void main(String[] args) {
        CountThread[] countThreadArray = new CountThread[100];
        for (int i = 0; i < 100; i++) {
            CountThread countThread = new CountThread();
            countThread.setName(String.valueOf(i));
            countThreadArray[i] = countThread;
        }
        for (int i = 0; i < 100; i++) {
            countThreadArray[i].start();
        }
    }
}
