package com.example.multithread.reentrantlock.lockmethodtest2;

import java.util.concurrent.locks.ReentrantLock;

public class FairService {
    private ReentrantLock lock;

    public FairService(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceFunction() {
        try {
            System.out.println("此锁是否被使用？" + lock.isLocked());
            System.out.println("当前线程是否持有该lock？" + lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println("isFairLock:" + lock.isFair());
            System.out.println("当前线程是否持有该lock？" + lock.isHeldByCurrentThread());
            System.out.println("此锁是否被使用？" + lock.isLocked());
        } finally {
            lock.unlock();
        }
    }
}
