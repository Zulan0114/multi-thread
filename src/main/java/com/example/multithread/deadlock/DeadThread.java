package com.example.multithread.deadlock;

public class DeadThread implements Runnable {
    private String userName;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void run() {
        if ("a".equals(userName)) {
            synchronized (lock1) {
                try {
                    System.out.println("userName = " + userName);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("lock2 after lock1");
                }
            }
        }

        if ("b".equals(userName)) {
            synchronized (lock2) {
                try {
                    System.out.println("userName = " + userName);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("lock1 after lock2");
                }
            }
        }
    }
}
