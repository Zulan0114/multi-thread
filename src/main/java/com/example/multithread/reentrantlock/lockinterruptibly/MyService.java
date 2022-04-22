package com.example.multithread.reentrantlock.lockinterruptibly;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    public ReentrantLock lock = new ReentrantLock();
    private Condition newCondition = lock.newCondition();

    public void testMethod() {
        try {
            lock.lock();
            System.out.println("wait begin");
//            newCondition.await();
            newCondition.awaitUninterruptibly();
            System.out.println("wait   end");
        } finally {
            lock.unlock();
        }
    }

    public void tryLock2() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName() + " get the lock, time " + System.currentTimeMillis());
                Thread.sleep(10000);
            } else {
                System.out.println(Thread.currentThread().getName() + " don't get the lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }

    public void tryLock() {
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " get the lock");
        } else {
            System.out.println(Thread.currentThread().getName() + " don't get the lock");
        }
    }

    public void waitMethod() {
        try {
//            lock.lock();
            lock.lockInterruptibly();
            System.out.println("lock begin " + Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String string = String.valueOf(Math.random());
            }
            System.out.println("lock   end " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("thread " + Thread.currentThread().getName() + " enter catch block");
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
