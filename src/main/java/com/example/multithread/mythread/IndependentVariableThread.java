package com.example.multithread.mythread;

public class IndependentVariableThread extends Thread {
    private int count = 5;

    public IndependentVariableThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            System.out.println(Thread.currentThread().getName() + " count = " + count--);
        }
    }
}
