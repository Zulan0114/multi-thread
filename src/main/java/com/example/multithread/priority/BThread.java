package com.example.multithread.priority;

import java.util.Random;

public class BThread extends Thread {
    @Override
    public void run() {
//        super.run();
//        System.out.println(this.getClass().getSimpleName() + " run priority = " + this.getPriority());
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50000; j++) {
                Random random = new Random();
                random.nextInt();
                addResult += j;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(this.getClass().getSimpleName() + " run used time = " + (endTime - beginTime) + ", addResult = " + addResult);
    }
}
