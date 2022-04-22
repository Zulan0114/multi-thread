package com.example.multithread.reentrantlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void awaitFunction() {
        try {
            lock.lock();
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalFunction() {
        try {
            lock.lock();
            System.out.println("there are " + lock.getWaitQueueLength(condition) + " waiting for condition");
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public void serviceFunction3() {
        try {
            lock.lock();
            System.out.println("ThreadName:" + Thread.currentThread().getName() + " enter serviceFunction3");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void serviceFunction1() {
        try {
            lock.lock();
            System.out.println("serviceFunction1 getHoldCount:" + lock.getHoldCount());
            serviceFunction2();
        } finally {
            lock.unlock();
        }
    }

    private void serviceFunction2() {
        try {
            lock.lock();
            System.out.println("serviceFunction2 getHoldCount:" + lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }
}
