package com.example.multithread.singleton;

public class MyObjectStatic {
    private static MyObjectStatic instance = null;

    private MyObjectStatic() {

    }

    static {
        instance = new MyObjectStatic();
    }

    public static MyObjectStatic getInstance() {
        return instance;
    }
}
