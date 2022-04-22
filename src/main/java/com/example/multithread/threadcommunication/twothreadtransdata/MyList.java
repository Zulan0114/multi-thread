package com.example.multithread.threadcommunication.twothreadtransdata;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private static List list = new ArrayList();
    public void add(String item) {
        list.add(item);
    }
    public int size() {
        return list.size();
    }
}
