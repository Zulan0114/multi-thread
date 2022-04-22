package com.example.multithread.threadcommunication.waitnotify;

public class ListWaitThread extends Thread {
    private final Object lock;

    public ListWaitThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock) {
                if (ListService.size() != 5) {
                    System.out.println("wait begin time=" + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end time=" + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
