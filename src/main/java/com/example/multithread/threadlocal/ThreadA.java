package com.example.multithread.threadlocal;

import java.util.Date;

public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
//            for (int i = 0; i < 100; i++) {
//                Tools.threadLocal.set("ThreadA" + (i + 1));
//                System.out.println("ThreadA get value:" + Tools.threadLocal.get());
//                Thread.sleep(200);
//            }
//            for (int i = 0; i < 20; i++) {
//                if (Tools.dateThreadLocal.get() == null) {
//                    Tools.dateThreadLocal.set(new Date());
//                }
//                System.out.println("A " + Tools.dateThreadLocal.get().getTime());
//                Thread.sleep(100);
//            }
            for (int i = 0; i < 10; i++) {
                System.out.println("A " + Tools.extDate.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
