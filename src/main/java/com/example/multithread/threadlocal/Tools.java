package com.example.multithread.threadlocal;

import java.util.Date;

public class Tools {
    public static ThreadLocal threadLocal = new ThreadLocal();
    public static ThreadLocal<Date> dateThreadLocal = new ThreadLocal<Date>();
    public static ThreadLocalExtDate extDate = new ThreadLocalExtDate();
}
