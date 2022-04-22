package com.example.multithread.waitnotifyinsert;

public class BackupAThread extends Thread {
    private DBTools dbTools;

    public BackupAThread(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backupA();
    }
}
