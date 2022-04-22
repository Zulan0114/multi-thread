package com.example.multithread.innerclass;

public class OutClass {
    static class InnerClass {
        public void functionA() {
            synchronized ("Other_Lock") {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " i=" + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        synchronized public void functionB() {
            for (int i = 10; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " i=" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class InnerClass1 {
        public void function1(InnerClass2 innerClass2) {
            String threadName = Thread.currentThread().getName();
            synchronized (innerClass2) {
                System.out.println(threadName + " enter function1() of InnerClass1");
                for (int i = 0; i < 10; i++) {
                    System.out.println(threadName + " i=" + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName + " exit function1() of InnerClass1");
            }
        }

        synchronized public void function2() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " enter function2() of InnerClass1");
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName + " i=" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " exit function2() of InnerClass1");
        }
    }

    static class InnerClass2{
        public synchronized void function1() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " enter function1() of InnerClass2");
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName + " i=" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " exit function1() of InnerClass2");
        }
    }
}
