package com.example.multithread.inheritablethreadlocal;

import java.util.Date;

public class InheritableThreadLocalExtDate extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + " added in child thread";
    }
}
