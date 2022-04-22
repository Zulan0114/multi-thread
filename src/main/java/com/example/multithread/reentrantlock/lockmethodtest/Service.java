package com.example.multithread.reentrantlock.lockmethodtest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    public ReentrantLock lock = new ReentrantLock();
    public Condition newCondition = lock.newCondition();

    public void notifyMethod() {
        try {
            lock.lock();
            System.out.println("有没有线程正在等待newCondition？" + lock.hasWaiters(newCondition) + " 线程数是多少？" + lock.getWaitQueueLength(newCondition));
            newCondition.signal();
        } finally {
            lock.unlock();
        }
    }

    public void waitMethod() {
        try {
            lock.lock();
//            Thread.sleep(Integer.MAX_VALUE);
            newCondition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
