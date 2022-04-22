package com.example.multithread.pipereadwriter;

import java.io.PipedReader;

public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedReader pipedReader;

    public ThreadRead(ReadData readData, PipedReader pipedReader) {
        super();
        this.readData = readData;
        this.pipedReader = pipedReader;
    }

    @Override
    public void run() {
        super.run();
        readData.read(pipedReader);
    }
}
