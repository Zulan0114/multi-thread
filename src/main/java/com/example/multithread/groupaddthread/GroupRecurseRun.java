package com.example.multithread.groupaddthread;

public class GroupRecurseRun {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup groupA = new ThreadGroup(mainGroup, "A");
        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    System.out.println("run");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        ThreadGroup groupB = new ThreadGroup(groupA, "B");
        ThreadGroup[] groupArray = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        // enumerate(groupArray, true) true是指递归取得子组及子孙组
        Thread.currentThread().getThreadGroup().enumerate(groupArray, true);
        for (ThreadGroup threadGroup : groupArray) {
            if (threadGroup != null) {
                System.out.println("groupArray " + threadGroup.getName());
            }
        }

        ThreadGroup[] groupArray1 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(groupArray1, false);
        for (ThreadGroup threadGroup : groupArray1) {
            if (threadGroup != null) {
                System.out.println("groupArray1 " + threadGroup.getName());
            }
        }
    }
}
