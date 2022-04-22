package com.example.multithread.stringandsyn;

public class StringThread extends Thread {
    private String str;
    public StringThread(String strParam) {
        super();
        str = strParam;
    }

    @Override
    public void run() {
        super.run();
//        StringService.print(str);
        StringService.printObject(new Object());
    }
}
