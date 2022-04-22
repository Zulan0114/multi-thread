package com.example.multithread.threadcommunication.waitnotify;

public class ListNotifyThread extends Thread {
    private final Object lock;

    public ListNotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    ListService.add();
                    if (ListService.size() == 5) {
                        lock.notify();
                        System.out.println("notified");
                    }
                    System.out.println("added " + (i + 1) + " items");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
