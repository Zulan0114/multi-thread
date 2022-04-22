package com.example.multithread.singleton;

public class MyObjectEnum {

    public static Object getInstance() {
        return MyObjectEnum1.factory.getInstance();
    }

    public enum MyObjectEnum1 {
        factory;
        private Object instance;

        private MyObjectEnum1() {
            instance = new Object();
        }

        public Object getInstance() {
            return instance;
        }
    }
}
