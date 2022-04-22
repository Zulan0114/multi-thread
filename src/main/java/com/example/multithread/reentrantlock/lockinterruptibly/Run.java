package com.example.multithread.reentrantlock.lockinterruptibly;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyService myService = new MyService();
        Runnable runnable = new Runnable() {
            public void run() {
//                myService.waitMethod();
//                myService.tryLock();
//                System.out.println(Thread.currentThread().getName() + " call tryLock2 time " + System.currentTimeMillis());
//                myService.tryLock2();
                myService.testMethod();
            }
        };
//        Thread threadA = new Thread(runnable);
//        threadA.setName("A");
//        threadA.start();
//        Thread.sleep(500);
//        Thread threadB = new Thread(runnable);
//        threadB.setName("B");
//        threadB.start();
//        threadB.interrupt();
//        System.out.println("main end");
//        Thread threadA = new Thread(runnable);
//        threadA.setName("A");
//        threadA.start();
//        Thread threadB = new Thread(runnable);
//        threadB.setName("B");
//        threadB.start();
        Thread myThread = new Thread(runnable);
        myThread.start();
        Thread.sleep(3000);
        myThread.interrupt();
    }
}
