package com.example.multithread.pipeinputoutput;

import java.io.PipedInputStream;

public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedInputStream pipedInputStream;

    public ThreadRead(ReadData readData, PipedInputStream pipedInputStream) {
        super();
        this.readData = readData;
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        super.run();
        readData.read(pipedInputStream);
    }
}
