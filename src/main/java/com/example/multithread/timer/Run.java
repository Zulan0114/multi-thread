package com.example.multithread.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
    private static Timer timer = new Timer();
//    private static Timer timer = new Timer(true);

    private static int runCount = 0;
    static public class MyTask1 extends TimerTask {
        @Override
        public void run() {
            System.out.println("MyTask1 run time:" + new Date());
//            try {
//                Thread.sleep(20000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("MyTask1 end time:" + new Date());
//            this.cancel();
//            timer.cancel();
//            try {
//                Thread.sleep(5000);
//                System.out.println("MyTask1 end time:" + new Date());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            runCount++;
//            if (runCount == 5) {
//                timer.cancel();
//            }
        }
    }

    static public class MyTask2 extends TimerTask {
        @Override
        public void run() {
            System.out.println("MyTask2 run time:" + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            MyTask1 myTask1 = new MyTask1();
            String dateString1 = "2022-04-14 15:04:00";
            Date date1 = simpleDateFormat.parse(dateString1);
            System.out.println("date string:" + date1 + ", current date:" + new Date());
//            timer.schedule(myTask1, date1, 3000);
            timer.scheduleAtFixedRate(myTask1, date1, 3000);//追赶执行

//            MyTask2 myTask2 = new MyTask2();
//            String dateString2 = "2022-04-14 14:50:00";
//            Date date2 = simpleDateFormat.parse(dateString2);
//            System.out.println("date string:" + date2 + ", current date:" + new Date());
//            timer.schedule(myTask2, date2, 4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
