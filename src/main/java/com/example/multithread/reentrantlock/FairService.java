package com.example.multithread.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class FairService {
    private ReentrantLock lock;

    public FairService(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceFunction() {
        try {
            lock.lock();
            System.out.println("ThreadName:" + Thread.currentThread().getName() + " get lock");
        } finally {
            lock.unlock();
        }
    }
}
