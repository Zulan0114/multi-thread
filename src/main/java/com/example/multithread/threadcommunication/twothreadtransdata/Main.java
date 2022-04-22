package com.example.multithread.threadcommunication.twothreadtransdata;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        ThreadA a = new ThreadA(myList);
        a.start();
        ThreadB b = new ThreadB(myList);
        b.start();
    }
}
