package com.example.multithread.pipereadwriter;

import java.io.PipedWriter;

public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedWriter pipedWriter;

    public ThreadWrite(WriteData writeData, PipedWriter pipedWriter) {
        super();
        this.writeData = writeData;
        this.pipedWriter = pipedWriter;
    }

    @Override
    public void run() {
        super.run();
        writeData.write(pipedWriter);
    }
}
