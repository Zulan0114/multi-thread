package com.example.multithread.inheritablethreadlocal;

import java.util.Date;

public class Run {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main " + Tools.extDate.get());
                Thread.sleep(100);
            }
            Date date = new Date();
            System.out.println("Set  " + date.getTime());
            Tools.extDate.set(date.getTime());
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
