package com.example.multithread.state;

public class Run {
    // NEW
    // RUNNABLE
    // TERMINATED
    // BLOCKED
    // WAITING
    // TIMES_WAITING
    public static void main(String[] args) {
//        try {
//            MyThread myThread = new MyThread();
//            System.out.println("state in main1: " + myThread.getState());
//            Thread.sleep(1000);
//            myThread.start();
//            Thread.sleep(1000);
//            System.out.println("state in main2: " + myThread.getState());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        try {
//            Runnable runnable = new Runnable() {
//                public void run() {
//                    MyService.service();
//                }
//            };
//            Thread thread1 = new Thread(runnable);
//            thread1.setName("A");
//            thread1.start();
//            Thread.sleep(1000);
//            Thread thread2 = new Thread(runnable);
//            thread2.setName("B");
//            thread2.start();
//            System.out.println("state of " + thread2.getName() + " in main: " + thread2.getState());

//            MyThread1 myThread1 = new MyThread1();
//            myThread1.setName("myThread1");
//            myThread1.start();
//            Thread.sleep(1000);
//            MyThread2 myThread2 = new MyThread2();
//            myThread2.setName("myThread2");
//            myThread2.start();
//            System.out.println("state of " + myThread2.getName() + " in main: " + myThread2.getState());

            MyThread3 myThread3 = new MyThread3();
            myThread3.setName("myThread3");
            myThread3.start();
            Thread.sleep(1000);
            System.out.println("state of " + myThread3.getName() + " in main: " + myThread3.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
