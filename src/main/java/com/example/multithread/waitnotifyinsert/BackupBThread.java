package com.example.multithread.waitnotifyinsert;

public class BackupBThread extends Thread {
    private DBTools dbTools;

    public BackupBThread(DBTools dbTools) {
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backupB();
    }
}
