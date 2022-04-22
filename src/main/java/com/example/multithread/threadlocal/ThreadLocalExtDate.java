package com.example.multithread.threadlocal;

import java.util.Date;

public class ThreadLocalExtDate extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
