package com.example.multithread.singleton;

import java.io.Serializable;

public class MyObject implements Serializable {
    private static final long serialVersionUID = 888L;

//    // 单例 饿汉模式
//    private static MyObject instance = new MyObject();

//    private static MyObject instance;

    // 内部类方式
    private static class MyObjectHandler {
        private static MyObject instance = new MyObject();
    }

    private MyObject() {

    }

//    synchronized
    public static MyObject getInstance() {
//        return instance;

        // 单例 懒汉模式
//        synchronized (MyObject.class) {
//            if (instance == null) {
//                instance = new MyObject();
//            }
//        }
//        return instance;

        // 内部类方式
        return MyObjectHandler.instance;
    }

    // 解决反序列化时的单例
    protected Object readResolve() {
        System.out.println("调用了readSolve方法");
        return MyObjectHandler.instance;
    }
}
