package com.example.multithread.stringandsyn;

public class StringRun {
    public static void main(String[] args) {
        StringThread a = new StringThread("AA");
        a.setName("A");
        a.start();
        StringThread b = new StringThread("AA");
        b.setName("B");
        b.start();
    }
}
