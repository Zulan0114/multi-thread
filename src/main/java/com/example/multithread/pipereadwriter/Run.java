package com.example.multithread.pipereadwriter;

import java.io.*;

public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedWriter pipedWriter = new PipedWriter();
            PipedReader pipedReader = new PipedReader();
            pipedReader.connect(pipedWriter);

            ThreadRead readThread = new ThreadRead(readData, pipedReader);
            readThread.start();

            Thread.sleep(2000);

            ThreadWrite writeThread = new ThreadWrite(writeData, pipedWriter);
            writeThread.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
