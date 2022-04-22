package com.example.multithread.pipeinputoutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedInputStream pipedInputStream = new PipedInputStream();
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            pipedOutputStream.connect(pipedInputStream);

            ThreadRead readThread = new ThreadRead(readData, pipedInputStream);
            readThread.start();

            Thread.sleep(2000);

            ThreadWrite writeThread = new ThreadWrite(writeData, pipedOutputStream);
            writeThread.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
