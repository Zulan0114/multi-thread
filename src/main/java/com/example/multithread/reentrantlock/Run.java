package com.example.multithread.reentrantlock;

public class Run {
    public static void main(String[] args) {
//        MyService myService = new MyService();
////        MyThread myThread1 = new MyThread(myService);
////        MyThread myThread2 = new MyThread(myService);
////        MyThread myThread3 = new MyThread(myService);
////        MyThread myThread4 = new MyThread(myService);
////        MyThread myThread5 = new MyThread(myService);
////        myThread1.start();
////        myThread2.start();
////        myThread3.start();
////        myThread4.start();
////        myThread5.start();
//
////        ThreadA a = new ThreadA(myService);
////        a.setName("A");
////        a.start();
////        ThreadAA aa = new ThreadAA(myService);
////        aa.setName("AA");
////        aa.start();
////        try {
////            Thread.sleep(100);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
////        ThreadB b = new ThreadB(myService);
////        b.setName("B");
////        b.start();
////        ThreadBB bb = new ThreadBB(myService);
////        bb.setName("BB");
////        bb.start();
//
////        ThreadA a = new ThreadA(myService);
////        a.setName("A");
////        a.start();
////        ThreadB b = new ThreadB(myService);
////        b.setName("B");
////        b.start();
////        try {
////            Thread.sleep(3000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//////        myService.signalFunction();
//////        myService.signalAll();
////        myService.signalAllA();
//
////        ThreadSet set = new ThreadSet(myService);
////        set.start();
////        ThreadGet get = new ThreadGet(myService);
////        get.start();
//
//        ThreadSet[] setArray = new ThreadSet[10];
//        ThreadGet[] getArray = new ThreadGet[10];
//        for (int i = 0; i < 10; i++) {
//            setArray[i] = new ThreadSet(myService);
//            getArray[i] = new ThreadGet(myService);
//            setArray[i].start();
//            getArray[i].start();
//        }
        final Service service = new Service();
//        service.serviceFunction1();
        Runnable runnable = new Runnable() {
            public void run() {
//                service.serviceFunction3();
                service.awaitFunction();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println("there are " + service.lock.getQueueLength() + " thread(s) waiting for lock");
        service.signalFunction();
    }
}
