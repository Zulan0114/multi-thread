package com.example.multithread.priority;

public class Run {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            AThread aThread = new AThread();
//            aThread.setPriority(5);
//            aThread.start();
//            BThread bThread = new BThread();
//            bThread.setPriority(6);
//            bThread.start();
//        }

        try {
            CountThread a = new CountThread();
            a.setPriority(Thread.NORM_PRIORITY - 3);
            a.start();
            CountThread b = new CountThread();
            b.setPriority(Thread.NORM_PRIORITY + 3);
            b.start();
            Thread.sleep(20000);
            a.stop();
            b.stop();
            System.out.println("a.getCount() = " + a.getCount());
            System.out.println("b.getCount() = " + b.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
