package com.example.multithread.threadcommunication.waitnotify;

import java.util.ArrayList;
import java.util.List;

public class ListService {
    private static List list = new ArrayList();

    public static void add() {
        list.add("anyString");
    }

    public static int size() {
        return list.size();
    }
}
