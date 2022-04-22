package com.example.multithread.innerclass;

public class Run {
    public static void main(String[] args) {
//        PublicClass publicClass = new PublicClass();
//        publicClass.setUserName("a");
//        publicClass.setPassword("aa");
//        System.out.println(publicClass.getUserName() + " " + publicClass.getPassword());
//
//        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
//        privateClass.setAge(18);
//        privateClass.setAddress("asdf");
//        System.out.println(privateClass.getAge() + " " + privateClass.getAddress());

//        final OutClass.InnerClass innerClass = new OutClass.InnerClass();
//        Thread threadA = new Thread(new Runnable() {
//            public void run() {
//                innerClass.functionA();
//            }
//        }, "A");
//        Thread threadB = new Thread(new Runnable() {
//            public void run() {
//                innerClass.functionB();
//            }
//        }, "B");
//        threadA.start();
//        threadB.start();

        final OutClass.InnerClass1 innerClass1 = new OutClass.InnerClass1();
        final OutClass.InnerClass2 innerClass2 = new OutClass.InnerClass2();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                innerClass1.function1(innerClass2);
            }
        }, "T1");
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                innerClass1.function2();
            }
        }, "T2");
        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                innerClass2.function1();
            }
        }, "T3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
