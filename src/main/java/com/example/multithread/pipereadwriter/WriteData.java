package com.example.multithread.pipereadwriter;

import java.io.IOException;
import java.io.PipedWriter;

public class WriteData {
    public void write(PipedWriter pipedWriter) {
        try {
            System.out.println("write:");
            for (int i = 0; i < 20; i++) {
                String outData = String.valueOf(i + 1);
                pipedWriter.write(outData);
                System.out.println("write:" + outData);
                Thread.sleep(1000);
            }
            System.out.println();
            pipedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
