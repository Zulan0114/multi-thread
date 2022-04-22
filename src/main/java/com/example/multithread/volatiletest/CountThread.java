package com.example.multithread.volatiletest;

import java.util.concurrent.atomic.AtomicInteger;

public class CountThread extends Thread {
//    volatile
    private static int count;
    private static AtomicInteger atomicInteger = new AtomicInteger(0);


    // synchronized和static配合，达到了对CountThread.class的锁定，实现了同步效果
    // 此时，volatile关键字就没必要使用了
    synchronized private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("thread name=" + Thread.currentThread().getName() + ", count=" + count);
    }

    private static void addAtomicInteger() {
        for (int i = 0; i < 100; i++) {
            System.out.println(atomicInteger.incrementAndGet());
        }
    }

    @Override
    public void run() {
        super.run();
//        addCount();
        addAtomicInteger();
    }
}
