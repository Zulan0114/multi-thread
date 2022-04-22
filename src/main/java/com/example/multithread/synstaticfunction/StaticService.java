package com.example.multithread.synstaticfunction;

public class StaticService {
    synchronized public static void printA() {
        try {
            System.out.println("thread name " + Thread.currentThread().getName() + " enter printA() at time " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("thread name " + Thread.currentThread().getName() + " exit printA() at time " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB() {
        System.out.println("thread name " + Thread.currentThread().getName() + " enter printB() at time " + System.currentTimeMillis());
        System.out.println("thread name " + Thread.currentThread().getName() + " exit printB() at time " + System.currentTimeMillis());
    }

    synchronized public void printC(){
        System.out.println("thread name " + Thread.currentThread().getName() + " enter printC() at time " + System.currentTimeMillis());
        System.out.println("thread name " + Thread.currentThread().getName() + " exit printC() at time " + System.currentTimeMillis());
    }
}
