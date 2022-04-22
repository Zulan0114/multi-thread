package com.example.multithread.threadcommunication.twothreadtransdata;

public class ThreadA extends Thread {
    private MyList myList;

    public ThreadA(MyList myList) {
        super();
        this.myList = myList;
    }

    @Override
    public void run() {
//        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                myList.add(String.valueOf(i));
                System.out.println("added " + (i+1) + " items");
                Thread.sleep(1000);
            }
            System.out.println("thread a exit");
            throw new InterruptedException();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
