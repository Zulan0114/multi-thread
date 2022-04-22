package com.example.multithread.synstaticfunction;

public class StaticRun {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();

        StaticService service = new StaticService();
        ThreadC c = new ThreadC(service);
        c.setName("C");
        c.start();
    }
}
