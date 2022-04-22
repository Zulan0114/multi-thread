package com.example.multithread.threadcommunication.twothreadtransdata;

public class ThreadB extends Thread {
    private MyList myList;

    public ThreadB(MyList myList) {
        super();
        this.myList = myList;
    }

    @Override
    public void run() {
//        super.run();
        try {
            System.out.println("thread b run");
            while (true) {
                if (myList.size() == 5) {
                    System.out.println("size==5, thread b is going to exit");
                    throw new InterruptedException();
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
