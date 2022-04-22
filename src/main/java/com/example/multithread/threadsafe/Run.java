package com.example.multithread.threadsafe;

public class Run {
    public static void main(String[] args) {
//        ALogin aLogin = new ALogin();
//        BLogin bLogin = new BLogin();
//        aLogin.start();
//        bLogin.start();
//        System.out.println("End of Run");

//        MyObject myObject = new MyObject();
//        ThreadA a = new ThreadA(myObject);
//        a.setName("A");
//        ThreadA b = new ThreadA(myObject);
//        b.setName("B");
//        a.start();
//        b.start();

        MyObject myObject = new MyObject();
        ThreadA a = new ThreadA(myObject);
        a.setName("A");
        ThreadB b = new ThreadB(myObject);
        b.setName("B");
        a.start();
        b.start();
    }
}
