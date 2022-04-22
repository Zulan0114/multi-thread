package com.example.multithread.singleton;

public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();

        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println(MyObject.getInstance().hashCode());
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        Runnable runnable1 = new Runnable() {
            public void run() {
//                System.out.println(MyObjectEnum.factory.getInstance().hashCode());
                System.out.println(MyObjectEnum.getInstance().hashCode());
            }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);
        Thread thread3 = new Thread(runnable1);
        Thread thread4 = new Thread(runnable1);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
