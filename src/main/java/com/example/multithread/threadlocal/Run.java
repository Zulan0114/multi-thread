package com.example.multithread.threadlocal;

public class Run {
    public static ThreadLocal threadLocal = new ThreadLocal();
    public static ThreadLocalExt ext = new ThreadLocalExt();

    public static void main(String[] args) {
        if (threadLocal.get() == null) {
            System.out.println("never set value");
            threadLocal.set("my value");
        }
        System.out.println("value:" + threadLocal.get());
        System.out.println("value:" + threadLocal.get());

        if (ext.get() == null) {
            System.out.println("never set value");
            ext.set("my value");
        }
        System.out.println("value:" + ext.get());
        System.out.println("value:" + ext.get());

        try {
//            ThreadA a = new ThreadA();
//            ThreadB b = new ThreadB();
//            a.start();
//            b.start();
//            for (int i = 0; i<100;i++) {
//                Tools.threadLocal.set("Main"+(i+1));
//                System.out.println("Main get value:"+Tools.threadLocal.get());
//                Thread.sleep(200);
//            }

//            ThreadA a = new ThreadA();
//            a.start();
//            Thread.sleep(1000);
//            ThreadB b = new ThreadB();
//            b.start();

            for (int i = 0; i < 10; i++) {
                System.out.println("Main " + Tools.extDate.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
