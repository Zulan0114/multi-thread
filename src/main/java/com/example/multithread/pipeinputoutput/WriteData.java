package com.example.multithread.pipeinputoutput;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {
    public void write(PipedOutputStream pipedOutputStream) {
        try {
            System.out.println("write:");
            for (int i = 0; i < 20; i++) {
                String outData = String.valueOf(i + 1);
                pipedOutputStream.write(outData.getBytes());
                System.out.println("write:" + outData);
                Thread.sleep(1000);
            }
            System.out.println();
            pipedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
