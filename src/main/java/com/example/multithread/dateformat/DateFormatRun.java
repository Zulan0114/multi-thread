package com.example.multithread.dateformat;

import java.text.SimpleDateFormat;

public class DateFormatRun {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[]{
                "2022-04-01", "2022-04-02", "2022-04-03", "2022-04-04", "2022-04-05", "2022-04-06", "2022-04-07", "2022-04-08", "2022-04-09", "2022-04-10"
        };
        DateFormatThread[] threadArray = new DateFormatThread[10];
        for (int i = 0; i < 10; i++) {
//            threadArray[i] = new DateFormatThread(simpleDateFormat, dateStringArray[i]);
            threadArray[i] = new DateFormatThread("yyyy-MM-dd", dateStringArray[i]);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
