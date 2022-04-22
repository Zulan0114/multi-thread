package com.example.multithread.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatThread extends Thread {
    private SimpleDateFormat simpleDateFormat;
    private String dateString;
    private String formatPattern;

    public DateFormatThread(SimpleDateFormat simpleDateFormat, String dateString) {
        super();
        this.simpleDateFormat = simpleDateFormat;
        this.dateString = dateString;
    }

    public DateFormatThread(String formatPattern, String dateString) {
        super();
        this.formatPattern = formatPattern;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
//            Date date = simpleDateFormat.parse(dateString);
//            String newDateString = simpleDateFormat.format(date);

//            Date date = DateTools.parse(formatPattern, dateString);
//            String newDateString = DateTools.format(formatPattern, date);

            Date date = DateTools.getSimpleDateFormat(formatPattern).parse(dateString);
            String newDateString = DateTools.getSimpleDateFormat(formatPattern).format(date);
            if (!newDateString.equals(dateString)) {
                System.out.println("ThreadName:" + Thread.currentThread().getName() + " has an error, original dateString:" + dateString + ", new dateString:" + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
