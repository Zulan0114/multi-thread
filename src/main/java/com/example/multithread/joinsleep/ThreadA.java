package com.example.multithread.joinsleep;

public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
//                b.start();
////                // Thread.sleep()不释放锁
////                Thread.sleep(6000);
//
//                // join释放锁
//                b.join();
//                for (int i = 0; i < Integer.MAX_VALUE; i++) {
//                    String newString = String.valueOf(Math.random());
//                }

                System.out.println("begin A threadName:" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("  end A threadName:" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
