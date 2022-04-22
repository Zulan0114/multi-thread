package com.example.multithread.reentrantreadwritelock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write() {
        try {
            lock.writeLock().lock();
            System.out.println("get the writeLock " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void read() {
        try {
            lock.readLock().lock();
            System.out.println("get the readLock " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }
}
