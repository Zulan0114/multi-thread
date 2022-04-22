package com.example.multithread.stringandsyn;

public class StringService {
    public static void print(String stringParam) {
        try {
            // String常量池
            // 一般情况下，synchronized同步代码块都不使用String作为锁对象
            synchronized (stringParam) {
                while (true) {
                    System.out.println("thread name " + Thread.currentThread().getName() + ", string param " + stringParam);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printObject(Object object) {
        try {
            synchronized (object) {
                while (true) {
                    System.out.println("thread name " + Thread.currentThread().getName() + ", object " + object);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
