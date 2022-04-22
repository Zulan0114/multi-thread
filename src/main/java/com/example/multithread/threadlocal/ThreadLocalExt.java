package com.example.multithread.threadlocal;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "this is initial value, the first get is not null";
    }
}
