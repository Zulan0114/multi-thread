package com.example.multithread.pipeinputoutput;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {
    public void read(PipedInputStream pipedInputStream) {
        try {
            System.out.println("read:");
            byte[] byteArray = new byte[20];
            int readLength = pipedInputStream.read(byteArray);
            while (readLength != -1) {
                String newData = new String(byteArray, 0, readLength);
                System.out.println("read:" + newData);
                readLength = pipedInputStream.read(byteArray);
            }
            System.out.println();
            pipedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
