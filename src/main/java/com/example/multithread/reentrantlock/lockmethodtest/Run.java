package com.example.multithread.reentrantlock.lockmethodtest;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            public void run() {
                service.waitMethod();
            }
        };
//        Thread threadA = new Thread(runnable);
//        threadA.start();
//        Thread.sleep(500);
//        Thread threadB = new Thread(runnable);
//        threadB.start();
//        Thread.sleep(500);
//        // hasQueuedThread(Thread thread) 查询指定的线程是否正在等待获取次lock
//        // hasQueuedThreads() 查询是否有线程正在等待获取次lock
//        System.out.println(service.lock.hasQueuedThread(threadA));
//        System.out.println(service.lock.hasQueuedThread(threadB));
//        System.out.println(service.lock.hasQueuedThreads());

        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
    }
}
