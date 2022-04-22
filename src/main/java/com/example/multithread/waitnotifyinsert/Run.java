package com.example.multithread.waitnotifyinsert;

public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 5; i++) {
            BackupAThread backupAThread = new BackupAThread(dbTools);
            backupAThread.start();

            BackupBThread backupBThread = new BackupBThread(dbTools);
            backupBThread.start();
        }
    }
}
