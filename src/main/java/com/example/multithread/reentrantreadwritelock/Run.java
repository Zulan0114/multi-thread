package com.example.multithread.reentrantreadwritelock;

public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            public void run() {
                service.read();
            }
        };
        Thread a = new Thread(runnable);
        a.setName("A");
        a.start();
        Thread b = new Thread(runnable);
        b.setName("B");
        b.start();

        Runnable runnable1 = new Runnable() {
            public void run() {
                service.write();
            }
        };
        Thread c = new Thread(runnable1);
        c.setName("C");
        c.start();
        Thread d = new Thread(runnable1);
        d.setName("D");
        d.start();
    }
}
