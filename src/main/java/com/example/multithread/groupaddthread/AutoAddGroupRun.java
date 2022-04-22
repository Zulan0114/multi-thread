package com.example.multithread.groupaddthread;

public class AutoAddGroupRun {
    public static void main(String[] args) {
        // activeGroupCount() 取得当前线程组对象中的子线程组数量
        System.out.println("A-thread: " + Thread.currentThread().getName() + " is in thread group: " + Thread.currentThread().getThreadGroup().getName()
                + ", active group count: " + Thread.currentThread().getThreadGroup().activeGroupCount());

        ThreadGroup group = new ThreadGroup("new-thread-group");
        System.out.println("B-thread: " + Thread.currentThread().getName() + " is in thread group: " + Thread.currentThread().getThreadGroup().getName()
                + ", active group count: " + Thread.currentThread().getThreadGroup().activeGroupCount());

        // enumerate(ThreadGroup[]) 将当前线程组中的子线程组以复制的形式拷贝到ThreadGroup[]数组对象中
        ThreadGroup[] groupArray = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(groupArray);
        for (ThreadGroup threadGroup : groupArray) {
            System.out.println("thread group name: " + threadGroup.getName());
        }

        System.out.println("thread: " + Thread.currentThread().getName() + " is in thread group: " + Thread.currentThread().getThreadGroup().getName()
                + ", parent thread group: " + Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println("parent parent thread group: " + Thread.currentThread().getThreadGroup().getParent().getParent().getName());
    }
}
