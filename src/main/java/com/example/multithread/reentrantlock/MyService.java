package com.example.multithread.reentrantlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    private boolean hasValue = false;

    public void get() {
        try {
            lock.lock();
            while (!hasValue) {
                System.out.println("maybe☆☆many");
                condition.await();
            }
            System.out.println("print☆");
            hasValue = false;
//            condition.signal();
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void set() {
        try {
            lock.lock();
            while (hasValue) {
                System.out.println("maybe★★many");
                condition.await();
            }
            System.out.println("print★");
            hasValue = true;
//            condition.signal();
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAllA() {
        try {
            lock.lock();
            System.out.println("  signalAllA time:" + System.currentTimeMillis() + " ThreadName:" + Thread.currentThread().getName());
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void signalAllB() {
        try {
            lock.lock();
            System.out.println("  signalAllB time:" + System.currentTimeMillis() + " ThreadName:" + Thread.currentThread().getName());
            conditionB.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll() {
        try {
            lock.lock();
            System.out.println("   signalAll time:" + System.currentTimeMillis() + " ThreadName:" + Thread.currentThread().getName());
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA time:" + System.currentTimeMillis() + " ThreadName:" + Thread.currentThread().getName());
//            condition.await();
            conditionA.await();
            System.out.println("  end awaitA time:" + System.currentTimeMillis() + " ThreadName:" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB time:" + System.currentTimeMillis() + " ThreadName:" + Thread.currentThread().getName());
//            condition.await();
            conditionB.await();
            System.out.println("  end awaitB time:" + System.currentTimeMillis() + " ThreadName:" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalFunction() {
        try {
            lock.lock();
            System.out.println("signal time:" + System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public void awaitFunction() {
        try {
            lock.lock();
            System.out.println(" await time:" + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void functionA() {
        try {
            lock.lock();
            System.out.println("functionA begin ThreadName " + Thread.currentThread().getName() + " time " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("functionA   end ThreadName " + Thread.currentThread().getName() + " time " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void functionB() {
        try {
            lock.lock();
            System.out.println("functionB begin ThreadName " + Thread.currentThread().getName() + " time " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("functionB   end ThreadName " + Thread.currentThread().getName() + " time " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void testFunction() {
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName " + Thread.currentThread().getName() + " " + (i + 1));
        }
        lock.unlock();
    }
}
