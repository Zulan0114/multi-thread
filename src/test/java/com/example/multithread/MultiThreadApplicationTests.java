package com.example.multithread;

import com.example.multithread.myrunnable.MyRunnable1;
import com.example.multithread.mythread.*;
import com.example.multithread.priority.AThread;
import com.example.multithread.priority.BThread;
import com.example.multithread.threadsafe.ALogin;
import com.example.multithread.threadsafe.BLogin;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MultiThreadApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testThreadName() {
        System.out.println(Thread.currentThread().getId() + " " + Thread.currentThread().getName());
    }

    @Test
    void testThreadRun() {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        System.out.println("End of Run");
    }

    @Test
    void testRandomThread() {
        MyThread2 myThread2 = new MyThread2();
        myThread2.setName("MyThread2");
        myThread2.start();

        try {
            for (int i = 0; i < 10; i++) {
                long time = (long) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main = " + Thread.currentThread().getId() + ", " + Thread.currentThread().getName() + ", " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 执行start()方法的顺序不代表线程启动的顺序
     */
    @Test
    void testThreadStart() {
        MyThread3 thread1 = new MyThread3(1);
        MyThread3 thread2 = new MyThread3(2);
        MyThread3 thread3 = new MyThread3(3);
        MyThread3 thread4 = new MyThread3(4);
        MyThread3 thread5 = new MyThread3(5);
        MyThread3 thread6 = new MyThread3(6);
        MyThread3 thread7 = new MyThread3(7);
        MyThread3 thread8 = new MyThread3(8);
        MyThread3 thread9 = new MyThread3(9);
        MyThread3 thread10 = new MyThread3(10);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }

    @Test
    void testRunnable() {
        Runnable runnable = new MyRunnable1();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("End of Run");
    }

    @Test
    void testIndependentVariableThread() {
        IndependentVariableThread threadA = new IndependentVariableThread("A");
        IndependentVariableThread threadB = new IndependentVariableThread("B");
        IndependentVariableThread threadC = new IndependentVariableThread("C");

        threadA.start();
        threadB.start();
        threadC.start();
    }

    @Test
    void testSharedVariableThread() {
        SharedVariableThread sharedVariableThread = new SharedVariableThread(5);
        Thread threadA = new Thread(sharedVariableThread, "A");
        Thread threadB = new Thread(sharedVariableThread, "B");
        Thread threadC = new Thread(sharedVariableThread, "C");
        Thread threadD = new Thread(sharedVariableThread, "D");
        Thread threadE = new Thread(sharedVariableThread, "E");
        Thread threadF = new Thread(sharedVariableThread, "F");

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        threadE.start();
        threadF.start();
    }

    @Test
    void testThreadSafe() {
        ALogin aLogin = new ALogin();
        BLogin bLogin = new BLogin();
        aLogin.start();
        bLogin.start();
        System.out.println("End of Run");
    }

    @Test
    void testStartRun() {
        /*
        constructor name: main
        run name: Thread-2
        异步执行
         */
        MyThread4 thread1 = new MyThread4();
        thread1.start();

        /*
        constructor name: main
        run name: main
        同步执行
         */
//        MyThread4 thread2 = new MyThread4();
//        thread2.run();
    }

    @Test
    void testNameAlive() {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        System.out.println("main---begin thread.isAlive()=" + thread.isAlive());
        thread.setName("A");
        thread.start();
        System.out.println("main---end thread.isAlive()=" + thread.isAlive());
    }

    @Test
    void testAlive() throws InterruptedException {
        AliveThread thread = new AliveThread();
        System.out.println("begin---isAlive=" + thread.isAlive());
        thread.start();
        Thread.sleep(1000);
        System.out.println("end---isAlive=" + thread.isAlive());
    }

    @Test
    void testStopThread() {
        try {
            System.out.println("main---begin");
            StopThread thread = new StopThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("main---exception");
        }
        System.out.println("main---end");
    }

    @Test
    void testThreadPriority() {
//        System.out.println(this.getClass().getSimpleName() + " thread begin priority = " + Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(6);
//        System.out.println(this.getClass().getSimpleName() + " thread end priority = " + Thread.currentThread().getPriority());
//        AThread thread = new AThread();
//        thread.start();

        for (int i = 0; i < 5; i++) {
            AThread aThread = new AThread();
            aThread.setPriority(1);
            aThread.start();
            BThread bThread = new BThread();
            bThread.setPriority(10);
            bThread.start();
        }
    }

    @Test
    void test() {
        String str = "123";
        String[] results = str.split(" - ");
        System.out.println(results[0]);
    }

}
