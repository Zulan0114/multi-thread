package com.example.multithread.reentrantlock.awaituntil;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("wait begin time:" + System.currentTimeMillis());
            condition.awaitUntil(calendar.getTime());
            System.out.println("wait   end time:" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("notify begin time:" + System.currentTimeMillis());
            condition.signalAll();
            System.out.println("notify   end time:" + System.currentTimeMillis());
        } finally {
            lock.unlock();
        }
    }
}
