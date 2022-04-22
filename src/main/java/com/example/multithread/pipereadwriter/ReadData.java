package com.example.multithread.pipereadwriter;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {
    public void read(PipedReader pipedReader) {
        try {
            System.out.println("read :");
            char[] byteArray = new char[20];
            int readLength = pipedReader.read(byteArray);
            while (readLength != -1) {
                String newData = new String(byteArray, 0, readLength);
                System.out.println("read :" + newData);
                readLength = pipedReader.read(byteArray);
            }
            System.out.println();
            pipedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
