package com.example.multithread.joinsleep;

public class Run {
    public static void main(String[] args) {
        try {
//            ThreadB b = new ThreadB();
//            ThreadA a = new ThreadA(b);
//            a.start();
//            Thread.sleep(1000);
//            ThreadC c = new ThreadC(b);
//            c.start();

            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("                   main end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
